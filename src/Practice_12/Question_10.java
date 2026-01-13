/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_12;

/**
 *
 * @author HP
 */
public class Question_10 {
    public static void main(String[] args) {
        double sum = 0;
        for(double d = 0; d<10;){
        d += 1.0;
        sum += sum +d; 
        
        
        }
        System.out.println(sum);
    }
}
