/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavaevidenceoopproblemsolve;

/**
 *
 * @author HP
 */
public class BKMainClass {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.weight = 5000;
        b.regularPrice = 500;
        System.out.println(b.weight);
        System.out.println(b.getSalePrice());
    }
}
