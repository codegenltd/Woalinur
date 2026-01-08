/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_08;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author md.woalinur
 */
public class Filecreate {
      public static void main(String[] args) {
          try {
              File fl = new File("F:\\iotest.java");
              
              if(fl.createNewFile()){
                  System.out.println("file is create");
              }else{
                  System.out.println("error");
              };
          } catch (IOException e) {
              System.out.println("error");
          }
    }
}
