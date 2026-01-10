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
public class HowToSendConstructorCopy {
    String name;
    double salary;
    HowToSendConstructorCopy (String n , double s){
    name = n;
    salary = s;
    };
    
    HowToSendConstructorCopy (HowToSendConstructorCopy h){
    name = h.name;
    salary = h.salary;
    };
    public static void main(String[] args) {
        HowToSendConstructorCopy p1 = new HowToSendConstructorCopy("olinur", 12.25);
    HowToSendConstructorCopy p2 = new HowToSendConstructorCopy(p1);
        System.out.println(p2.name);
        System.out.println(p2.salary);
    }
    
}
