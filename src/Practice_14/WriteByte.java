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
public class WriteByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fl = new FileOutputStream("E:\\olinur.txt");
            String st = "new byte code write a somthing";
            byte [] bt = st.getBytes();
            fl.write(bt);
            fl.close();
            System.out.println("write successfull");
            
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
