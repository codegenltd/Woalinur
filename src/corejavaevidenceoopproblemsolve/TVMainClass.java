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
public class TVMainClass {
    public static void main(String[] args) {
        Truck t = new Truck();
       t.regularPrice = 500;
       t.weight = 4000;
        System.out.println(t.getsalePrice());
        System.out.println(t.weight);
    }
}
