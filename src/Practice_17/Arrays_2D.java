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
public class Arrays_2D {
    public static void main(String[] args) {
        
        
        int [][] arr_2D ={{2,4,3},{2,3,1},{7,5,6}};
        
        for(int i = 0; i<arr_2D.length; i++){
            int [] arr_1D = {2,3,5,1,4,6};
        for(i = 0; i< arr_1D.length; i++){
        for(int j = 1 + i; j<arr_1D.length; j++){
        int temp = arr_1D[i];
        if(arr_1D[i] > arr_1D[j]){
        arr_1D[i] = arr_1D[j];
        arr_1D[j] = temp;
        }
        }
        //System.out.println(arr_1D[i]);
        }
            for (int b : arr_1D) {
                for (int c : arr_1D) {
                    System.out.print(c);
                }
                 System.out.print(" ");
            }
           
        }
    }
    
}
