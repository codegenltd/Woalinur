/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class FileInputSteam {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\io.test.java");
            int a;
            while((a = fis.read()) != -1){
                System.out.println((char)a);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
