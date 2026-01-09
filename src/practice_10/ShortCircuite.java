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
public class ShortCircuite {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if(b == 4 || a/b <0){
            System.out.println("OK");
        }else{
            System.out.println("not Ok");
        }
    }
    
}
