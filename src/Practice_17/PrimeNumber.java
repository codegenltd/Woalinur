/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_17;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        boolean p = true;
        if(s <= 1){
        p = false; 
        }
        for(int i =2 ; i<s /2; i++  ){
        if( s % 2==0){
        p = false;
        break; 
        }
        }
        if(p){
            System.out.println("prime number:" + " " +s);
        }else{
            System.out.println("Non prime number:" + " " + s);
        }
    }
}
