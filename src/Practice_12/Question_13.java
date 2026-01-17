/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_12;

/**
 *
 * @author md.woalinur
 */
public class Question_13 {
    public static void main(String[] args) {
        int [] a = {0,2,4,1,3};
        for(int i =0; i<a.length; i++){
        a[i] = a[(a[i]+ 3)% a.length];
        }
        
    }
}
