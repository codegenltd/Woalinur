/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;

import java.io.File;

/**
 *
 * @author HP
 */
public class RenameToFile {
    public static void main(String[] args) {
        try {
            File old = new File("E:\\olinur.txt");
            File newest = new File("E:\\nur.txt");
            old.renameTo(newest);
            System.out.println("rename successfull");
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
