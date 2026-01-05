/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_05;

/**
 *
 * @author HP
 */
import java.util.*;
import java.util.function.Consumer;
public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        Consumer <Integer> method = (n) -> {
            System.out.println(n);};
        l.forEach(method);
        }
    };

