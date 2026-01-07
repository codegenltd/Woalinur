/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_07;
import java.io.File;
/**
 *
 * @author HP
 */
public class GetFileInfo {
    public static void main(String[] args) {
        try {
            File fl = new File("E:\\test_2.java");
            if(fl.exists()){
                System.out.println(fl.createNewFile());
                System.out.println(fl.getName());
                System.out.println(fl.getAbsolutePath());
                System.out.println(fl.canRead());
                System.out.println(fl.length());
            }else{
            
            };
        } catch (Exception e) {
        }
    }
}
