package Conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    public static Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbPath = System.getProperty("user.dir") + "/database/DB_CobroD.db";
            Connection cn = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            //System.out.println("Conexion Correcta");
         
            return cn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return null;
    }
       

  
}
