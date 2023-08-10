/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion_BD.Conexion;
import Graficas.Clientes_vista;
import Modelos.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ramon
 */
public class Ctrl_Clientes {

    public boolean guardar(Clientes objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setInt(4, objeto.getPrestamo());
            consulta.setInt(5, objeto.getPlazo_dias());
            consulta.setDouble(6, objeto.getIntereses());
            consulta.setInt(7, objeto.getIdCategoria());

            consulta.setInt(8, objeto.getMora());
            consulta.setInt(9, objeto.getPrestamo_restante());
            consulta.setInt(10, objeto.getEstado());
            consulta.setObject(11, objeto.getFecha_vencimiento());
            consulta.setInt(12, objeto.getValor_cuota());
            consulta.setObject(13, objeto.getDireccion());

            consulta.setObject(14, objeto.getNumero_celular());

            consulta.setInt(15, objeto.getContador_estado());
            consulta.setInt(16, objeto.getPrestamo_intereses());
            consulta.setInt(17, objeto.getContador_estado_paz());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el cliente: " + e);
        }
        return respuesta;
    }

    public boolean existeCliente(String nombre) {
        boolean respuesta = false;
        String sql = "select nombre, apellido from clientes where nombre = '" + nombre + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }

    public boolean eliminar(int idClientes) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from clientes where idclientes ='" + idClientes + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }

    public boolean editar(Clientes cliente) {
        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement consulta = conexion.prepareStatement("UPDATE clientes SET nombre = ?, apellido = ?, prestamo = ?, prestamo_restante = ?, plazo_dias = ?, mora = ?, fecha_vencimiento = ?, idcategorias = ?,valor_cuota = ?, numero_celular = ?, direccion = ?, prestamo_interes = ?, intereses=? WHERE idclientes = ?");
            consulta.setString(1, cliente.getNombre());
            consulta.setString(2, cliente.getApellido());
            consulta.setInt(3, cliente.getPrestamo());
            consulta.setInt(4, cliente.getPrestamo_restante());
            consulta.setInt(5, cliente.getPlazo_dias());
            consulta.setInt(6, cliente.getMora());
            consulta.setDate(7, cliente.getFecha_vencimiento());
            consulta.setInt(8, cliente.getIdCategoria());
            consulta.setInt(9, cliente.getValor_cuota());
            consulta.setString(10, cliente.getNumero_celular());
            consulta.setString(11, cliente.getDireccion());

            consulta.setInt(12, cliente.getPrestamo_intereses());

            consulta.setInt(13, cliente.getIdClientes());
            consulta.setDouble(14, cliente.getIntereses());

            consulta.executeUpdate();
            consulta.close();
            conexion.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
