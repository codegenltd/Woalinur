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
public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            int [] arr = {10,15,20};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException t) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
