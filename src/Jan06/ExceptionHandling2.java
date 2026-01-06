/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;



/**
 *
 * @author md.woalinur
 */
public class ExceptionHandling2 {
    public static void main(String[] args) {
        
    
    try{
    
           String n = null;
            System.out.println(n.length());
 }catch(NullPointerException o){
            System.out.println("NullPointerException");
}
}
}
