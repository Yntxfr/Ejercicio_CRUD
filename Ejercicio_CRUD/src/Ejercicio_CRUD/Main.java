/*
 * Click url nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click url nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Ejercicio_CRUD;
/*
import java.sql.*;
import java.util.*;
*/

/**
 *
 * @author Administrador
 */

public class Main {

    /**User
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User usuario1 = new User("PeterParker", "2244112", "parkerp@oscorp.com");

        userDAO.printUserDetails();
        userDAO.insertUserDetails("user70","raccooning","radioactiveRaccoon@pm.me");
        System.out.println("Nueva lista con los usuarios nuevos: ");
        userDAO.printUserDetails();

        /* userDAO.deleteUser(1, "user70"); */

        userDAO.updateUserEmail(3, "radiraccoon@email.com");

    }
}