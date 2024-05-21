/*
 * Click url nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click url nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Ejercicio_CRUD;


public class User {
    private String userName;
    private String password;
    private String email;

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        userDAO.insertUserDetails(userName,password,email);
    }

    public String getEmail(){
        return userDAO.getUserEmail(this.userName);
    }
}
