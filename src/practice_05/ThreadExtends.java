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
public class ThreadExtends {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
        t.start();
    }
}
class MyThread extends Thread {
public void run (){
    System.out.println("thread is running");
}
}