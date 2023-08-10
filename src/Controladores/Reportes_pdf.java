/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion_BD.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Reportes_pdf {
public void reporteClientes() throws SQLException {
    // Obtener la fecha actual en formato yyyy/mm/dd
    Date fechaActual = new Date();

    // Definir el formato deseado para la fecha
    SimpleDateFormat formatoFecha = new SimpleDateFormat("ddMMyyyy_HHmmss");

    // Formatear la fecha actual como una cadena de texto
    String fechaActualStr = formatoFecha.format(fechaActual);

    Document documento = new Document();
    try {
        String ruta = System.getProperty("user.home") + "/Desktop/Reporte";
        File directorio = new File(ruta);

        // Verificar si la carpeta existe
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        // Verificar si la carpeta "Reporte_clientes" existe dentro de la carpeta "Reporte"
        File carpetaReporteClientes = new File(ruta + "/Reporte_clientes");
        if (!carpetaReporteClientes.exists()) {
            carpetaReporteClientes.mkdir();
        }

        // Crear el nombre del archivo con la fecha actual
        String nombreArchivo = "Reporte_De_Clientes_" + fechaActualStr.replaceAll("/", "") + "_"
                + formatoFecha.format(new Date()) + ".pdf";

        PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Reporte_clientes/" + nombreArchivo));

        // Formato al texto
        Paragraph parrafo = new Paragraph();
        parrafo.setAlignment(Paragraph.ALIGN_CENTER);
        parrafo.add("Reporte creado por \n\n\n");
        parrafo.setFont(FontFactory.getFont("Roboto", 18, Font.BOLD, BaseColor.DARK_GRAY));
        parrafo.add("Reporte de Clientes  \n\n");

        documento.open();
        // Agregamos los datos
        documento.add(parrafo);

        float[] columnsWidths = {4, 5, 5, 5, 5, 5, 5, 5}; // Ancho de columnas
        PdfPTable tabla = new PdfPTable(columnsWidths);

        tabla.addCell("Nombre");
        tabla.addCell("Fecha");
        tabla.addCell("Ciudad");
        tabla.addCell("Prestamo");
        tabla.addCell("Plazo (días)");
        tabla.addCell(""); // Columna en blanco adicional
        tabla.addCell(""); // Columna en blanco adicional

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT c.nombre, c.apellido AS fecha, ci.ciudad, c.prestamo, c.plazo_dias " +
                            "FROM clientes c " +
                            "LEFT JOIN historial_abonos ha ON c.idclientes = ha.idclientes " +
                            "LEFT JOIN categoria ci ON c.idcategorias = ci.idcategoria " +
                            "WHERE ha.id = (SELECT MAX(id) FROM historial_abonos WHERE idclientes = c.idclientes) " +
                            "GROUP BY c.idclientes;"
            );
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                tabla.addCell(rs.getString(1)); // Nombre
                tabla.addCell(rs.getString("fecha")); // Fecha (anteriormente apellido)
                tabla.addCell(rs.getString("ciudad")); // Ciudad
                tabla.addCell(rs.getString("prestamo")); // Préstamo
                tabla.addCell(rs.getString("plazo_dias")); // Plazo en días
                tabla.addCell(""); // Celda en blanco adicional
                tabla.addCell(""); // Celda en blanco adicional
                tabla.completeRow(); // Cerrar la fila de la tabla
            }

            documento.add(tabla);

            rs.close();
            pst.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error 4 en: " + e);
        }

        documento.close();

        JOptionPane.showMessageDialog(null, "Reporte creado");

    } catch (DocumentException e) {
        System.out.println("Error 1 en: " + e);
    } catch (FileNotFoundException ex) {
        System.out.println("Error 2 en: " + ex);
    } catch (IOException ex) {
        System.out.println("Error 3 en: " + ex);
    }
}






public void generarInformePDF(int idClientes, String cliente) {
    Document documento = new Document();
    try {
        String ruta = System.getProperty("user.home") + "/Desktop/Reporte";
        File directorio = new File(ruta);

        // Verificar si la carpeta existe
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        // Verificar si la carpeta "Reporte De Los Clientes" existe dentro de la carpeta "Reporte"
        File carpetaReporteClientes = new File(ruta + "/Reporte De Los Clientes");
        if (!carpetaReporteClientes.exists()) {
            carpetaReporteClientes.mkdir();
        }

        // Crear el nombre del archivo con el nombre del cliente y el ID
        String nombreArchivo = "Reporte De " + cliente + "_" + idClientes + ".pdf";

        PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Reporte De Los Clientes/" + nombreArchivo));

        // Formato al texto
        Paragraph parrafo = new Paragraph();
        parrafo.setAlignment(Paragraph.ALIGN_CENTER);
        parrafo.add("Reporte de Historial de Abonos de Cliente\n\n");

        documento.open();
        // Agregamos los datos
        documento.add(parrafo);

        float[] columnsWidths = {2, 2, 2, 2, 2, 2, 2, 2}; // Definir los anchos de las columnas
        PdfPTable tabla = new PdfPTable(columnsWidths);

        tabla.addCell("Nombre");
        tabla.addCell("Fecha");
        tabla.addCell("Prestamo");
        tabla.addCell("Cuotas");
        tabla.addCell("Abonos");
        tabla.addCell("Resta");
        tabla.addCell(""); // Columna en blanco adicional
        tabla.addCell(""); // Columna en blanco adicional

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT c.nombre, c.apellido, c.prestamo, c.plazo_dias, ha.monto, ha.prestamo_restante, ha.fecha FROM clientes c LEFT JOIN historial_abonos ha ON c.idclientes = ha.idclientes WHERE c.idclientes = ?");
            pst.setInt(1, idClientes);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                tabla.addCell(rs.getString("nombre"));
                tabla.addCell(rs.getString("apellido"));
                tabla.addCell(rs.getString("prestamo"));
                tabla.addCell(rs.getString("plazo_dias"));
                tabla.addCell(rs.getString("monto"));
                tabla.addCell(rs.getString("prestamo_restante"));
                tabla.addCell(""); // Columna en blanco adicional
                tabla.addCell(""); // Columna en blanco adicional
            }

            rs.close();
            pst.close();
            cn.close();

            documento.add(tabla);

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL: " + e.getMessage());
        }

        documento.close();

        JOptionPane.showMessageDialog(null, "Reporte creado");

    } catch (DocumentException e) {
        System.out.println("Error al generar el informe PDF: " + e.getMessage());
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
    } catch (IOException ex) {
        System.out.println("Error de entrada/salida: " + ex.getMessage());
    }
}




public void generarInformePDFH(int idClientes, String cliente) {
    Document documento = new Document();
    try {
        String ruta = System.getProperty("user.home") + "/Desktop/Reporte";
        File directorio = new File(ruta);

        // Verificar si la carpeta existe
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        // Verificar si la carpeta "Reporte De Los Clientes" existe dentro de la carpeta "Reporte"
        File carpetaReporteClientes = new File(ruta + "/Reporte De Los Clientes");
        if (!carpetaReporteClientes.exists()) {
            carpetaReporteClientes.mkdir();
        }

        // Crear el nombre del archivo con el nombre del cliente y el ID
        String nombreArchivo = "Reporte De " + cliente + "_" + idClientes + ".pdf";

        PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Reporte De Los Clientes/" + nombreArchivo));

        // Formato al texto
        Paragraph parrafo = new Paragraph();
        parrafo.setAlignment(Paragraph.ALIGN_CENTER);
        parrafo.add("Reporte de Historial de Abonos de Cliente\n\n");

        documento.open();
        // Agregamos los datos
        documento.add(parrafo);

        float[] columnsWidths = {2, 2, 2, 2, 2, 2, 2, 2}; // Definir los anchos de las columnas
        PdfPTable tabla = new PdfPTable(columnsWidths);

        tabla.addCell("Nombre");
        tabla.addCell("Fecha");
        tabla.addCell("Prestamo");
        tabla.addCell("Cuotas");
        tabla.addCell("Abonos");
        tabla.addCell("Resta");
        tabla.addCell(""); // Columna en blanco adicional
        tabla.addCell(""); // Columna en blanco adicional

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT c.nombre, c.apellido, c.prestamo, c.plazo_dias, ha.monto, ha.prestamo_restante, ha.fecha,ganancia FROM clientes c LEFT JOIN historial_abonos_respaldo ha ON c.idclientes = ha.idclientes WHERE c.idclientes = ?");
            pst.setInt(1, idClientes);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                tabla.addCell(rs.getString("nombre"));
                tabla.addCell(rs.getString("apellido"));
                tabla.addCell(rs.getString("prestamo"));
                tabla.addCell(rs.getString("plazo_dias"));
                tabla.addCell(rs.getString("monto"));
                tabla.addCell(rs.getString("prestamo_restante"));
                tabla.addCell(""); // Columna en blanco adicional
                tabla.addCell(""); // Columna en blanco adicional
            }

            rs.close();
            pst.close();
            cn.close();

            documento.add(tabla);

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL: " + e.getMessage());
        }

        documento.close();

        JOptionPane.showMessageDialog(null, "Reporte creado");

    } catch (DocumentException e) {
        System.out.println("Error al generar el informe PDF: " + e.getMessage());
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
    } catch (IOException ex) {
        System.out.println("Error de entrada/salida: " + ex.getMessage());
    }
}

}

    


