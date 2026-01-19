/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement.employeeDAO;

import employeemanagement.util.DBConnection;
import employeemanagement.model.EmpModel;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author HP
 */
public class EmpDAO {
    public EmpModel DAOPanel(EmpModel e){
       
        String emp2 = e.getName();
        double emp3 = e.getSalary();
        String sql = "INSERT INTO emplist (name, salary) VALUES ('"+emp2+"','"+emp3+"')";
        try {
            //get the connection;
            Connection cd = DBConnection.getConnection();
            //Create a statement 
            Statement st = cd.createStatement();
            // Execute the statement 
            int ex = st.executeUpdate(sql);
            if(ex > 0){
                System.out.println("inserted");
            }else{
                System.out.println("not insert in DB");
            }
            
        } catch (Exception d) {
            System.out.println("Exception occure");
            d.printStackTrace();;
        }
    return e;
    }
}
