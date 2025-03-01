/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
     private final String url = "jdbc:mysql://localhost/sakila",
            usr = "root",
            pwd = "3340";

   public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usr, pwd);
    } 
}

