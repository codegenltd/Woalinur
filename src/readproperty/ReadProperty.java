/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author HP
 */
public class ReadProperty {
    public static void main(String[] args) {
        try {
           Properties pro = new Properties();
           InputStream read = ReadProperty.class
                   .getClassLoader()
                   .getResourceAsStream("readproperty/MyProperties.properties");
           //read = new FileInputStream("readproperty/MyProperties.properties");
           pro.load(read);
           
//          
//           // get the property value and print it out
//            System.out.println(pro.getProperty("DB_url"));
//            System.out.println(pro.getProperty("DB_user"));
//            System.out.println(pro.getProperty("DB_password"));
//            read.close();
//            
             // Prints everything from a properties file
            for (String key : pro.stringPropertyNames()) {
                String value = pro.getProperty( key);
                System.out.println("key:" + key + "value" + value);
                
            }
//            Enumeration em = pro.propertyNames();
//            while(em.hasMoreElements()){
//            String key =(String) em.nextElement();
//            String value = pro.getProperty(key);
//                System.out.println("key:" + key + " " + ":-value:" +  value);
//            }
            
        } catch (IOException e) {
            System.out.println("property file read faild");
            e.printStackTrace();;
        }
    }
}
