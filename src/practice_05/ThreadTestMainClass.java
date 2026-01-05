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
public class ThreadTestMainClass {
    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        t.run();
        t.start();
        ThreadInterface f = new ThreadInterface();
        f.run();
        
    }
}
