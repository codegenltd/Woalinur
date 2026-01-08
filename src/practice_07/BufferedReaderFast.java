/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_07;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class BufferedReaderFast {
    public static void main(String[] args) {
        try {
             String l;
        BufferedReader bf = new BufferedReader(new FileReader("E:\\iotest.java"));
        
        while ( (l = bf.readLine()) !=null){
            System.out.println(l);
        };
        bf.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
