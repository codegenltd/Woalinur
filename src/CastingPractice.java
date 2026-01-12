/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class Parent {
void test (){
    System.out.println("is a parent class method");
}


};

class Child extends Parent {
void t (){
    System.out.println("this is a child class");
}
};



public class CastingPractice {
    public static void main(String[] args) {
        Parent p = new Parent();
        //p.test();
        if(p instanceof Child){
        Child c = (Child) p;
            System.out.println(c.getClass());
        }
        
    }
}
