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
public class RandomNumber_2 {
    public static void main(String[] args) {
        Random ram = new Random();
        HashSet<Integer> Hash = new HashSet<Integer>();
        
        while (Hash.size() < 10){
        Hash.add(ram.nextInt(50));
        }
        System.out.println(Hash);
    }
}
