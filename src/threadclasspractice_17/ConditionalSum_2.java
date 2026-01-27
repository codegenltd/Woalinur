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
public class ConditionalSum_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b;
        while(true){
        b = sc.nextInt();
        if(b == 0){
        break;
        }else{
        a += b;
        }
        }
        System.out.println("Total Sum:" + a);
    }
}
