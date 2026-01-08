/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_08;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class DeleteFile {
    public static void main(String[] args) {
        try {
            File f = new File("E:\\test_2.java");
            if(f.delete()){
                System.out.println("deleted file" + f.getName());
            }else{
                System.out.println("not deleted");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
