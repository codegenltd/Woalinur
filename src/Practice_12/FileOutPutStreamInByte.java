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
public class FileOutPutStreamInByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fl = new FileOutputStream("F:\\iotest" , true);
            String st = "\nthis is new file byte code test ";
            byte[] bt = st.getBytes();
            fl.write(bt);
            fl.close();
            System.out.println("successfull");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
