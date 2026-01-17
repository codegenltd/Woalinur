/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_14;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ReadFileToDifferentWay {
    public static void main(String[] args) {
        try {
            File wrt = new File("E:\\olinur.txt");
            Scanner sc = new Scanner(wrt);
            while(sc.hasNext()){
            String st = sc.next();
                System.out.println(st);
            }
            sc.close();
            
            
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
