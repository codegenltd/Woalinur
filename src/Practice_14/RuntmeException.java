/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;

/**
 *
 * @author HP
 */
public class RuntmeException extends Exception {
    public static void main(String[] args) throws Exception  {
        int monyout = 300;
        int myBlc = 500;
        if(monyout > myBlc){
            throw new Exception ("empty blc");
        }else{
            System.out.println("successful");
        }
    }
}
