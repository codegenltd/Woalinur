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
public class ThreadRunnable {
    public static void main(String[] args) {
        ImpThread Rn = new ImpThread() {
            
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
           Rn.run();
        
    }
}
 abstract class ImpThread implements Runnable {
public void RunnableThread (){
    System.out.println("Runnable thread start");
    
    
}

}
