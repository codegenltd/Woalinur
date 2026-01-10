/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_11;
import java.util.concurrent.*;
import java.util.Iterator;
/**
 *
 * @author HP
 */
public class ConcurrentPractice {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer , String> map = new ConcurrentHashMap<>();
        map.put(01,"oli");
        
      Thread td = new Thread();
      map.put(02, "olinur");
              
      td.start();
      for(Integer key : map.keySet()){
          System.out.println(key);
      }
        
    }
}
