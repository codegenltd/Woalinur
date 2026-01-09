/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_10;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author HP
 */
public class DateTimePractice {
    public static void main(String[] args) {
       Date d = new Date();
       d.toGMTString();
        System.out.println(d);
        d.getDate();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getMonth());
        System.out.println(d.getDay());
        System.out.println(d.toString());
        
    }
}
