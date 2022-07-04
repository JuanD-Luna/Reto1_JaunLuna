package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //1. Estamos creando una instancia ed la clase connection.
    Connection connection; 
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g53_db";
    String usuario = "root";
    String contrasena = "";
    
    public Conexion() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            if (connection != null) {
                System.out.println("Conexion establecida con la base de datos ");
        }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida con la base de datos ");
        }   
    }
    
    //Creamos una funcion que nos va a retornar la clase Connection
    public Connection getConnection() {
        return connection;
    }
}
