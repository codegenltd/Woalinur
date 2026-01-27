/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclasspractice_17;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
//not working this code 
public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ram = new Random();
        HashSet<Integer> h = new HashSet<Integer>();
        
        System.out.println("how many unique number");
        int count = sc.nextInt();
        
        System.out.println("number range");
        int range = sc.nextInt();
        
        if(count > range){
            System.out.println("can not be gaterthan range");
        return;
        }
        
        while (h.size() < count){
            h.add(ram.nextInt(range));
        
        }
        System.out.println(h);
        
    }
}
