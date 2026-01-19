/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readproperty;

import java.util.Properties;

/**
 *
 * @author HP
 */
public class TestProperty {
    public static void main(String[] args) {
        Properties pr = System.getProperties();
        pr.list(System.out);
    }
}
