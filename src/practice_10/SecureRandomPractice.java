/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_10;

import java.security.SecureRandom;

/**
 *
 * @author HP
 */
public class SecureRandomPractice {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(100);
        System.out.println(sr);
        sr.setSeed(100);
        
        System.out.println(100);
    }
}
