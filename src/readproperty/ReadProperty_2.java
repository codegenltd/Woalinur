/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readproperty;


import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author HP
 */
public class ReadProperty_2 {
    public static void main(String[] args) {
        try {
            Properties pp = new Properties();
            InputStream rd = ReadProperty_2.class
                    .getClassLoader()
                    .getResourceAsStream("readproperty/MyProperties.properties");
            //null hole crash korte  pare tai condition deya hlo
//            if(rd ==null){
//                System.out.println("not found file ");
//                return;
//            }
            pp.load(rd);
//            System.out.println(pp.getProperty("DB_url")); 
//            System.out.println(pp.getProperty("DB_user"));
//            System.out.println(pp.getProperty("DB_password"));
//            rd.close();
            
            for (String key : pp.stringPropertyNames()) {
                String value = pp.getProperty(key);
                System.out.println("key=" + key +"=value=" + value);
            }
            
        } catch (Exception e) {
            System.out.println("error occure");
            e.printStackTrace();
        }
    }
}
