/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_17;

/**
 *
 * @author md.woalinur
 */
public class ArraySort {
    public static void main(String[] args) {
        int [][] arr = {{1,5,8,},{4,6,9,},{2,3,7}};
        
        for(int i = 0; i <arr.length; i++){
             int [] sArr = {2,5,4,1,3};
        for(i = 0; i<sArr.length; i++){
            for(int j =i+1; j<sArr.length; j++){
                if(sArr[i] > sArr[j]){
                    int temp = sArr[i];
            sArr [i] = sArr[j];
            sArr[j] = temp;
                }
            }
    }
           
            for (int b :sArr ) {
                for (int t : sArr) {
                    System.out.print(t + " ");
                }
                System.out.println("");
            }
        
        }
            
    }
}
