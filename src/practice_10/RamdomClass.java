/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_10;

import java.util.Random;

/**
 *
 * @author HP
 */
public class RamdomClass {
    public static void main(String[] args) {
        Random r = new Random();
        Random rn = new Random(); // seed example
        System.out.println(r.nextInt(10)); //3 same out put
        
        System.out.println(rn.nextInt(10)); // 3 same out put 
        
        
//        System.out.println(r.nextInt(10)); //0
//        int a = r.nextInt(10) +1;
//        System.out.println(a);
//        System.out.println(r.nextDouble());
    }
}
