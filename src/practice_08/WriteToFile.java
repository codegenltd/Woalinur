/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.IOException;
import java.io.FileWriter;
/**
 *
 * @author HP
 */
public class WriteToFile {
    public static void main(String[] args) {
        try {
        
        FileWriter fw = new FileWriter("E:\\iotest.java");
        fw.write("i love you java");
       fw.close();
               
            System.out.println("write successfull");
            
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
