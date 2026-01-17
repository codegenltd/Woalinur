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
public class Arrays_1D {
    public static void main(String[] args) {
        int [] arr = {2,5,4,3,1,6,7};
        
        for(int i =0; i<arr.length; i++){
         for(int j =1+i; j < arr.length; j++){
         int temp = arr[i];
         if(arr[i] > arr[j]){
         arr[i] = arr[j];
         arr[j] = temp;
         }
         }
            System.out.println(arr[i]);
        }
       
    }
}
