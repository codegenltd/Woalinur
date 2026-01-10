/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_10;

/**
 *
 * @author HP
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
            String b = null;
            System.out.println(b);
            int [] c = {1,2};
            System.out.println(c.length);
            
            
        } catch (ArithmeticException e) {
            System.out.println("handling arith");
        }
        catch(NullPointerException n){
            System.out.println("handling is null ");
        } 
        catch(IndexOutOfBoundsException i){
            System.out.println("handling out of index");
        }
        finally{
            System.out.println("Alawys run");
        }
    }
}
