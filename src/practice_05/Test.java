/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_05;

/**
 *
 * @author HP
 */
class a {
           void e(){
           System.out.println("void class a");
           }
       }

    class b {
                void f(){
                System.out.println("void class b");
                         }
           }

public class Test {
    public static void main(String[] args) {
        a r = new a();
        r.e();
        b m = new m();
        m.f();
        Test tea = new Test();
        for(int i = 0; i<10; i++){
           tea.t();
        }
        for (int i = 0; i<5; i++){
        tea.d();
        }
    }
    void t (){
        System.out.println("this is void method name is t");
    }
    void d (){
        System.out.println("this is void method there name is d");
    }

    private static class m extends b {

        public m() {
        }
    }
};
