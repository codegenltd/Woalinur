/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;
import java.io.*;
/**
 *
 * @author HP
 */
public class ReadByte {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("E:\\olinur.txt");
            int i ;
            while((i = in.read()) != -1){
            System.out.println((char)i);
        }
            in.close();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
