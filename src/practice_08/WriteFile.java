/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("E:\\test_2.java");
            fr.write("write this msg normaly in file");
            fr.close();
            System.out.println("write successfull");
        } catch (IOException e) {
            System.out.println("error occure");
        }
    }
}
