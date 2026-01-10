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
public class CopyConstructorPractice {
    int age;
   String name;
    CopyConstructorPractice (int a , String b){
    age = a;
   name = b;
    };
   
   CopyConstructorPractice (CopyConstructorPractice e){
    age = e.age;
    name = e.name;
    
    
    };
   
    public static void main(String[] args) {
        CopyConstructorPractice m = new CopyConstructorPractice(10,"nur");
        CopyConstructorPractice m1 = new CopyConstructorPractice(m);
        System.out.println(m1.age);
        System.out.println(m1.name);
    }
}
