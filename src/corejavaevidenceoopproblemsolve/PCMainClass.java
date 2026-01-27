/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavaevidenceoopproblemsolve;

/**
 *
 * @author HP
 */
public class PCMainClass {
    public static void main(String[] args) {
        ChildClass cl = new ChildClass();
        cl.test();
        //ChildClass cp = (ChildClass) new ParentClass();
        //cp.child();
        ParentClass p = new ParentClass();
        p.child();
        
        
        
    }
}
