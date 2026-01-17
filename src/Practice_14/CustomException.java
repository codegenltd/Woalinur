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
class Test extends Exception {
public Test (String msg){
super(msg);
}
}
public class CustomException {
    public static void main(String[] args) {
        int out = 300;
        int in = 200;
        try {
            
            if(out> in){
               throw new Test ("blc is empty");
            }else{
                System.out.println("successfully");
            }
        } catch (Test  e) {
            System.out.println(e.getMessage());
            
        }
    }
}
