package Ejercicio_CRUD;
import java.sql.*;
import java.util.*;


/**
 *
 * @author Administrador
 */
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/Ejercicio-CRUD";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}