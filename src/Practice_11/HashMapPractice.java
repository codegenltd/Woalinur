/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_11;
import java.util.*;
import java.util.Iterator;
/**
 *
 * @author HP
 */
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(1, "nur");
        hm.put(2, "oli");
        hm.put(3, "akon");
        
        Iterator<Integer> it = hm.keySet().iterator();
        while(it.hasNext()){
       Integer key = it.next();
         System.out.println(key + " " + hm.get(key));
        }
    }
}
