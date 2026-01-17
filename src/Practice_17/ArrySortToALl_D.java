/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_17;

/**
 *
 * @author HP
 */
public class ArrySortToALl_D {
    public static void main(String[] args) {
       
            //System.out.println(arr[i]);
        
        int [][] arr2 = {{2,5,4,1,3},{7,6,9,8},{11,10,12}};
        for (int i = 0; i <arr2.length; i++) {
             int [] arr = {2,5,1,3,4};
        for ( i = 0; i <arr.length; i++) {
            for (int j = 1 + i; j <arr.length; j++) {
                int temp = arr[i];
                if(arr[i] > arr[j]){
                arr[i] = arr[j];
                arr[j] = temp;
            }
            }
            for (int j = 0; j < arr2.length; j++) {
                
            }
            
        }
            for (int b : arr) {
                for (int c : arr) {
                    System.out.print(c);
                }
                System.out.println(" ");
            }
    }
    }
}
