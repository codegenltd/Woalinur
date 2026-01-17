/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_12;
import java.io.*;

/**
 *
 * @author md.woalinur
 */
public class FileOutPutStreamPractice {
    public static void main(String[] args) {
        try {
            FileOutputStream fw = new FileOutputStream("F:\\iotest");
            String s = "hello file i am olinur how are you";
           byte[] by = s.getBytes();
           fw.write(by);
           fw.close();
            System.out.println("successfull");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
