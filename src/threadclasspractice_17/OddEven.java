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
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int s = sc.nextInt();
       if(sc.nextInt() % 2 == 0){
               
           System.out.println("Odd Number");
       }else{
           System.out.println("Even Number");
       }
        
    }
}
