/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclasspractice_17;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author HP
 */
public class RandomNumberSimple {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> h = new HashSet<Integer>();
        
        while (h.size() < 10 ){
        h.add(r.nextInt(20));
        }
        System.out.println("Random number:" + h);
    }
}
