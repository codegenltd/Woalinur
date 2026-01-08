/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_07;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
/**
 *
 * @author HP
 */
public class BufferWriterFast {
    public static void main(String[] args) {
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("E:\\io.test.java"));
            wr.write("i am olinur ");
            wr.write("my name is olinur");
            wr.newLine();
            wr.write("how are you");
            System.out.println("write successfull");

        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
