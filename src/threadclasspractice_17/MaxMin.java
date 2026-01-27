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
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1st number");
        int s1 = sc.nextInt();
        System.out.println("2nd number");
        int s2 = sc.nextInt();
        System.out.println("3rd number");
        int s3 = sc.nextInt();
        
        int max = s1;
                int min =s1;
         if(s2 > max){
         max = s2;
         }
         if(s3 > max){
         max = s3;
         }
         if(s2 < min){
         min = s2;
         }
         if(s3 < min){
         min = s3;
         }
         System.out.println("max" + max);
         System.out.println("min" + min);
    }
}
