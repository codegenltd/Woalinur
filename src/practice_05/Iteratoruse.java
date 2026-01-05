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
public class Iteratoruse {
    public static void main(String[] args) {
        Employees em1 = new Employees(101,"Nur", 12.32);
        Employees em2 = new Employees(102,"Nur", 45.32);
        Employees em3 = new Employees(103,"Nur", 19.32);
        
        Set s = new HashSet();
        for(int i = 1; i<100; i++){
        s.add(i);
        }
        Iterator sl = s.iterator();
        Map mp = new HashMap();
        mp.put(sl.next(), em1);
        mp.put(sl.next(), em2);
        mp.put(sl.next(), em3);
        
        for(Object e : mp.keySet()){
            System.out.println("key:" + " " + e + " "  +"value:" + mp.get(e));
        }
        
    }
}
