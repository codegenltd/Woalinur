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
public class Bike extends Car {
    int weight;

    @Override
    double getSalePrice() {
       if(weight > 2000){
       double dis = 0.10;
       double nw = regularPrice - (regularPrice * dis);
       return nw;
       }else{
           return regularPrice;
       }
    }
    
}
