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
public class MaxMin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s > 2){
        s = 2;
        }
        int arr[] = new int[s];
        for(int i = 0 ; i<s ; i++){
        arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 1 ; i<s; i++){
        if(arr[i] > largest){
         largest = arr[i];
        }
        if(arr[i] < smallest){
        smallest = arr[i];
        }
        }
        System.out.println("largest:" + " " + largest);
        System.out.println("smallest:" + " " + smallest);
    }
 
}
