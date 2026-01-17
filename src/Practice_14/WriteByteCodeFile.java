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
public class WriteByteCodeFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fil = new FileOutputStream("E:\\olinur.txt",true);
            String st = "2ed time test to file write in byte code";
           byte[] b = st.getBytes();
           fil.write(b);
            fil.close();
            
            
            
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
