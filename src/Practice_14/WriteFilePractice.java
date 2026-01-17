/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class WriteFilePractice {
    public static void main(String[] args) {
        try {
         FileWriter wrt = new FileWriter("E:\\olinur.txt");
         wrt.write("I am a java lerner");
            
            wrt.close();
            System.out.println("successfull writing");
          
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
        
    }
}
