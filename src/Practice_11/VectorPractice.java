/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_11;
import java.util.Iterator;
import java.util.Vector;
/**
 *
 * @author HP
 */
public class VectorPractice {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println(v);
        Iterator it = v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
