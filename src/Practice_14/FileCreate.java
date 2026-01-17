/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class FileCreate {
    public static void main(String[] args) {
        try {
            File cre = new File("E:\\olinur.txt");
            cre.createNewFile();
            System.out.println("successfull");
            
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
