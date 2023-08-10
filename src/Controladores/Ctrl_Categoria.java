package Controladores;

import Conexion_BD.Conexion;
import Modelos.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ctrl_Categoria {

    /**
     * **************************************************
     * metodo para guardar una nueva categoria
     * **************************************************
     */
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = Conexion_BD.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into categoria values(?,?,?)");
           
            consulta.setString(2, objeto.getCiudad());
            consulta.setString(3, objeto.getTipo_deudor());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar : " + e);
            
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si la categoria registrado ya existe
     * ********************************************************************
     */
    public boolean existeCategoria(String ciudad) {
        boolean respuesta = false;
        String sql = "select descripcion from categoria where ciudad = '" + ciudad + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar cartegoria: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para actualizar una nueva categoria
     * **************************************************
     */
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion_BD.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update categoria set descripcion=? where idCategoria ='" + idCategoria + "'");
            consulta.setString(1, objeto.getCiudad());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar cartegoria: " + e);
        }

        return respuesta;
    }
    
    
    /**
     * **************************************************
     * metodo para eliminar una nueva categoria
     * **************************************************
     */
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from categoria where idCategoria ='" + idCategoria + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar cartegoria: " + e);
        }

        return respuesta;
    }
}
