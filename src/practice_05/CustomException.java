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
import java.lang.Exception;
import java.util.Scanner;
import static practice_05.Admisson.ageTest;


class Agecheker extends Exception{
public Agecheker (String not_valid){
//super ();
}
}
class Admisson{
static void ageTest(int age) throws Agecheker{
if(age < 18){
throw new Agecheker("your not valid to admisson");
}else{
    System.out.println("you valid to admisson");  
}
}
}

public class CustomException {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       
       try{
       ageTest(s);
       }catch(Agecheker a){
           System.out.println(a.getMessage());
       }
    }
}
