/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclasspractice_17;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PowerProblemSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int base = sc.nextInt();
        
        long result = 1;
        for (int i = 1; i <power; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}


class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pow = sc.nextInt();
        int base = sc.nextInt();
        
        long result = 1;
        for (int i = 1; i <pow; i++) {
            result *= base;
            
        }
        System.out.println("Power:" + result);
        
    }
}