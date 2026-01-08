/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_07;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class FileOutPutStream {
    public static void main(String[] args) {
        try {
           FileOutputStream ot = new FileOutputStream("E:\\io.test.java");
           String i = "hello world";
           ot.write(i.getBytes());
            System.out.println("write successfully");
           
        } catch (IOException e) {
            System.out.println("erro");
            e.printStackTrace();
        }
    }
    
}
