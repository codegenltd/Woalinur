/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class FileReaderPractice {
    public static void main(String[] args) {
       
        
        try {
            FileReader rd = new FileReader("E:\\olinur.txt");
             Scanner sc = new Scanner(rd);
             
            while(sc.hasNext()){
            String st = sc.next();
                System.out.println(st);
                
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
    
}
