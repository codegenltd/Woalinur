/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_11;

/**
 *
 * @author HP
 */
public class AssertPractice {
    public static void main(String[] args) {
//        int a = 10;
//        assert a>5 : "cancle";
//        System.out.println("done");
        int v = 15;
        assert v < 18 : "not a voter" ;
        System.out.println("it's a voter");
    }
}
