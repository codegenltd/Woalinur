/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.File;
import java.io.Reader;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author HP
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            File rd = new File("E:\\iotest.java");
            Scanner sc = new Scanner(rd);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            
            };
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File  not found ");
            
        }
        
    }
}
