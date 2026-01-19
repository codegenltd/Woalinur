/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class DBConnection {
    public static void main(String[] args) {
        Connection cd = null;
        try {
            Properties pr = new Properties();
            InputStream stm = DBConnection.class
                    .getClassLoader().getResourceAsStream("util/Property.txt");
            pr.load(stm);
            String url = pr.getProperty("DB_url");
            String user = pr.getProperty("DB_user");
            String password = pr.getProperty("DB_password");
           
            Scanner sc = new Scanner(System.in);
            System.out.println("inter your name");
            String n = sc.nextLine();
            System.out.println("inter your salary");
            double s = sc.nextDouble();
            
            
//            String n = "M olinur";
//            double s = 1500.00;
            
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "INSERT INTO emplist (name,salary) VALUES ('"+n+"', '"+s+"')";
            
            //get the connection
           cd = DriverManager.getConnection(url,user,password);
           
           //get the statement
           Statement st = cd.createStatement();
           
           int out = st.executeUpdate(sql);
           if(out >0){
               System.out.println("inserted");
           }
        } catch (Exception e) {
            System.out.println("error occure");
            e.printStackTrace();
            
        }
    }
}
