/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_10;

/**
 *
 * @author HP
 */

public class UserdefineException {
    
     static void AgeCheck (int age) throws ArithmeticException{
     if(age <18){
     throw new ArithmeticException(" not valid");
     }else{
         System.out.println("valid");
     };
     };
    public static void main(String[] args) {
        try {
           AgeCheck(19);
        } catch (ArithmeticException e) {
            System.out.println("error msg");
        }
    }
}
