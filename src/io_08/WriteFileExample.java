/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_08;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author md.woalinur
 */
public class WriteFileExample {
    public static void main(String[] args) {
        try {
            File fr = new File("F:\\khairulvai.text");
          FileWriter fl = new FileWriter(fr);
          fl.write("this is my hand ");
            System.out.println("successfull");
          fl.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
