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
public class IteratorSequence {
    public static void main(String[] args) {
        
    
    Employees np1 = new Employees(201,"Akon", 15.15);
     Employees np2 = new Employees(202,"Akon", 15.15);
      Employees np3 = new Employees(203,"Akon", 15.15);
       Employees np4 = new Employees(204,"Akon", 15.15);
       
       Set s = new HashSet();
       for(int i = 1; i<100; i++){
       s.add(i);
       }
       Iterator t = s.iterator();
       Map mp = new HashMap();
       mp.put(t.next(), np1);
       mp.put(t.next(), np2);
       mp.put(t.next(), np3);
       mp.put(t.next(), np4);
       
       for(Object e : mp.keySet()){
           System.out.println(e + " " +mp.get(e));
       }
       
        //System.out.print(mp);
       
       
    }      
}
