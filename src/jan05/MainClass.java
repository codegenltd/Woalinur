/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05;

/**
 *
 * @author md.woalinur
 */
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        
        Employer e1 = new Employer(101,"OLI",15000.15);
        Employer e2 = new Employer(102,"nur",12000.10);
        Employer e3 = new Employer(103,"akon",18000.16);
        System.out.println(e1.getId());
        
        Set s = new HashSet();
        s.add(e1);
        s.add(e2);
        s.add(e3);
       
        for(Object o : s){
            System.out.println(o);
        }
    }
    }

