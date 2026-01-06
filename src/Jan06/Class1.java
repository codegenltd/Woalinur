/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author md.woalinur
 */
import java.util.*;
public class Class1 {
    public static Map main(String[] args) {
        Trainess t1 = new Trainess(01,"TrainessAddress");
        Trainess t2 = new Trainess(01,"TrainessAddress");
        Trainess t3 = new Trainess(01,"TrainessAddress");
        
    
    Map map = new HashMap();
    map.put(01,t1);
    map.put(02, t2);
    map.put(03, t3);
    return map;
    }  
    
}
