/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_05;

/**
 *
 * @author HP
 */
class EmptyBlc extends Exception {
 EmptyBlc(String msg){
super ("your blc is empty");
}
};
public class AtmBoothRuntimeException {
    public static void main(String[] args) throws EmptyBlc {
        int cashout = 1000;
        int blance = 800;
        if(blance > cashout){
           throw new EmptyBlc ("not suffeciant blance");
        }else{
            System.out.println("successfull");
        }
    }
}
