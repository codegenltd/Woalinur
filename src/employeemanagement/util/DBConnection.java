/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement.util;

import java.sql.Connection;

import java.sql.DriverManager;
/**
 *
 * @author HP
 */
public class DBConnection {
    
    public static Connection getConnection () {
        Connection cd = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/empmgt";
            String user = "root";
            String password = "root";
          
           cd = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connection successful");
            
        } catch (Exception e) {
            System.out.println("Database Connection faild");
            e.printStackTrace();
        }
        return cd;
    }
}
