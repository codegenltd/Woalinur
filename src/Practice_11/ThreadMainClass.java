/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_11;

/**
 *
 * @author md.woalinur
 */
public class ThreadMainClass {
    public static void main(String[] args) {
        
    
    ThreadClass td = new ThreadClass();
    td.run();
    td.start();
        System.out.println(td);
    Thread_2 t = new Thread_2();
    t.run();
        System.out.println(t);
   
    }  
}
