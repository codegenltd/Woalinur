/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_08;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author md.woalinur
 */
public class FileCre {
    public static void main(String[] args) {
        try {
            File fle = new File("F:\\khairulvai.text");
            if(fle.createNewFile()){
                System.out.println("successful");
            }else{
                System.out.println("not create file");
            };
            
            
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
            
            
        }
    }
}
