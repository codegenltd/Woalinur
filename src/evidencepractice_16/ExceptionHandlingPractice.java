/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencepractice_16;
import java.lang.Exception;
import java.lang.ArrayIndexOutOfBoundsException;
import java.sql.Array;

/**
 *
 * @author HP
 */
public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
class A {
    public static void main(String[] args) {
        try {
            String s = null;
            //System.out.println(s);
        } catch (NullPointerException e) {
            System.out.println("error null");
            e.printStackTrace();
        }
    }
}

class B {
    public static void main(String[] args) {
        try {
            int [] ar = {1,2,3,4};
            System.out.println(ar[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bound");
            e.printStackTrace();
        }
    }
}
