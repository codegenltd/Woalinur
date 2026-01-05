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

public class EmployeesMainClass {
    public static void main(String[] args) {
        
    
    Employees emp1 = new Employees(01,"nur",15000.15);
    Employees emp2 = new Employees(02,"oli",15000.15);
    Employees emp3 = new Employees(03,"woali",15000.15);
    Employees emp4 = new Employees(04,"akon",15000.15);
    Employees emp5 = new Employees(05,"woli",15000.15);
    
    List l = new LinkedList();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    l.add(6);
    
    //System.out.println(l.iterator());
         Iterator ll = l.iterator();
    
        //System.out.println(ll.next());
        //System.out.println(ll.hasNext());
//        while(ll.hasNext()){
//            System.out.println(ll.next());
//        }
        
    
    Set<Integer> s = new HashSet();
    for(int i = 1; i<100; i++){
        s.add(i);
    }
    Iterator sl = s.iterator();
    Map<Integer,Employees> p = new HashMap<Integer,Employees>();
    p.put((Integer)sl.next(), emp1);
    p.put((Integer) sl.next(), emp2);
    p.put((Integer)sl.next(), emp3);
    p.put((Integer) sl.next(), emp4);
    p.put((Integer)sl.next(), emp5);
  
     for(Integer m : p.keySet()){
         System.out.println("Key:" + m +  "Value:" + p.get(m) );
     }
    
    
    }
}
