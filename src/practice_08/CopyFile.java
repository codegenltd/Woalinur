/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\io.test.java");
           FileOutputStream fot = new FileOutputStream("E:\\io.test.java");
           int i;
           while((i=fis.read()) != -1){
           fot.write(i);
           };
            fis.close();
        } catch (IOException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
    }
}
