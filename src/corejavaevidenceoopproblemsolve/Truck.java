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
public class Truck extends Vechicle {
    int weight;
    
//
//    @Override
//    double getsalePrice() {
//       if(weight > 2000){
//           double dis = 0.10;
//           double nw = regularPrice - (regularPrice * dis);
//       return nw;
//       }else{
//       return regularPrice;
//       }
//    }

    @Override
    double getsalePrice() {
        if(weight > 2000){
        return super.regularPrice * 0.10;
        }else{
        return super.regularPrice;
        }
    }
}

