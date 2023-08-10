    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar() throws SQLException {
        Connection cn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\redol\\Documents\\NetBeansProjects\\ProgramaVentas\\DBVentas.db");
            System.out.println("Conexión exitosa");
                    return cn;

        } catch (ClassNotFoundException e) {
            System.out.println("Error en conexión " + e.getMessage());
        }
        return null;
    }
}
