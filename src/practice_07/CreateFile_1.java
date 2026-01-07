/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_07;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class CreateFile_1 {
    public static void main(String[] args) {
        try {
            File fl =  new File("E:\\test_2.java");
            if(fl.createNewFile()){
                System.out.println("successful");
            }else{
                System.out.println("not crate");
            };
        } catch (IOException e) {
            System.out.println("error");
            
        }
    }
}
