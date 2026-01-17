/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;

/**
 *
 * @author HP
 */
public class Question_10 {
    public static void main(String[] args) {
        int i =0, j=1;
        if((i++ == 1)&&(j++ == 2)){
            System.out.println(i); 
        i = 42;
        }
        System.out.println("i=" + i + "j=" + j);
    }
}
