/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author md.woalinur
 */

public class ExceptionHandling {
    
    
    public static void main(String[] args) {
       
        try {
           int a = 10, b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
