/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_05;

/**
 *
 * @author HP
 */
import java.util.*;
public class EmployeesDAO {
    public static List main(String[] args) {
        String sql = " select * From Employees";
        Employees e_1 = new Employees(501,"Nur",15.12);
        Employees e_2 = new Employees(501,"Nur",15.12);
        Employees e_3 = new Employees(501,"Nur",15.12);
        
        
        List list = new ArrayList();
        list.add(e_1);
        list.add(e_2);
        list.add(e_3);
        return list;
    }
    Employees GetById(){
        String sql = "select * From Employees where Employees id = 501";
            Employees e_1 = new Employees(501,"Nur",15.12);
            return e_1;
    }
    
}
