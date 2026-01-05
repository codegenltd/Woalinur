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
public class ThreadClass extends Thread {

    @Override
    public void run() {
       for(int i =0; i<5; i++){
           System.out.println("This is thread class extends by thread");
       }
    }
    
}
