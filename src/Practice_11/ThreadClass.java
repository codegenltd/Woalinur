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
public class ThreadClass extends Thread {

    @Override
    public void run() {
        super.run(); 
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void start() {
        super.start(); 
    }
    
    
}
