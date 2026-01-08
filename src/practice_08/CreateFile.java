/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author HP
 */

public class CreateFile {
    public static void main(String[] args) {
        
        
        try {
            File nf = new File("E:\\iotest.java");
            if(nf.createNewFile()){
                System.out.println("file create:" + nf.getAbsolutePath());
            }else{
                System.out.println("File already exists:");
            }
        } catch (IOException e) {
            System.out.println("An error normally");
            e.getStackTrace();
        }
    }
}
