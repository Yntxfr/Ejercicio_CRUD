package Ejercicio_CRUD;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class userDAO {

    public static void printUserDetails() {

        String query = "SELECT * FROM users;";
        try(Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {

            while(rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                System.out.println(id + " , nombre usuario: " + username + " , email: " + email);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertUserDetails(String username, String password, String email) {
        String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?);";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            System.out.println("Nuevo usuario insertado: ");

        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(int id) {
        String query = "DELETE FROM users WHERE id = ?;";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUserEmail(int id, String newEmail) {
        String query = "UPDATE users SET email = ? WHERE id = ?;";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();}
    }

    public static String getUserEmail(String username){
        String email = "";
        String query = "SELECT email FROM users where username = ?;";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){

            pstmt.setString(1,username);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                email = rs.getString("email");
                System.out.println(" email: " + email );
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return email;
    }
}