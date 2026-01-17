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
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        long fact = 1;
        for (int i = 1; i <=s; i++) {
            fact *= i;
        }
        System.out.println("Factorial number:" + fact);
    }
}
class testFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        long fact = 1;
        for (int i = 1; i <=s; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
