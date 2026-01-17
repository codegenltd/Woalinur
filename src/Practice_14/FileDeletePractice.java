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
public class FileDeletePractice {
    public static void main(String[] args) {
       
            File fl = new File("E:\\iotest.java");
            if(fl.delete()){
             System.out.println("delete successfull");
            }else{
             System.out.println("File is alrady deleted");
            }
    }
}
