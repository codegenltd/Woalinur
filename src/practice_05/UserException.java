/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_05;
import java.lang.Exception;
import static practice_05.admissonAgeCheck.test;

/**
 *
 * @author HP
 */
import java.util.Scanner;

class ageNotValid extends Exception {

    public ageNotValid(String not_valid_) {
        super ("not valid");
    }
    
}

class admissonAgeCheck{
static void test(int age) throws ageNotValid{

if(age < 18) {
throw new ageNotValid ("not valid ");
}else{
System.out.println("you valid to admisson");
}
}
}
public class UserException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
      try{
      test(s);
      }catch(ageNotValid e){
          System.out.println(e.getMessage());
      }
    }
}
