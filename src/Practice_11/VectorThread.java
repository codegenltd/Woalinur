/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_11;

import java.util.Vector;
import java.lang.NullPointerException;
/**
 *
 * @author HP
 */
class MyThread extends Thread{
    
          Vector<Integer> a;

MyThread (Vector<Integer> v){
this.a = a;
};

public void run(){
for(int i = 0; i< 5; i++){
    a.add(i);
   }
};
};


public class VectorThread {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        
        Thread t1 = new MyThread(v);
        Thread t2 = new MyThread(v);
        t1.start();
        t2.start();
    }
}
