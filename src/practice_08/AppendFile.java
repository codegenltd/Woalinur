/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class AppendFile {
    public static void main(String[] args) {
        try  {
            FileWriter fr = new FileWriter("E:\\iotest.java",true);
            fr.write("this is append example");
            System.out.println("append build succefull");
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
