/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_10;

import java.util.PriorityQueue;

import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class PQParctice {
    public static void main(String[] args) {
//       
//        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
//        p.add(10);
//        p.add(20);
//        p.add(30);
//        p.add(40);
//        System.out.println(p);
//        System.out.println(p.poll());
//        System.out.println(p);
//        System.out.println(p.peek());
//        System.out.println(p);
        
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
//        System.out.println(pq);
//        System.out.println(pq.poll()); //10
//        System.out.println(pq);
//        System.out.println(pq.peek());
//        System.out.println(pq);
     Iterator<Integer> it = pq.iterator();
//       while(it.hasNext()){
//           System.out.println(it.next());
//       }
//       for(Integer i : pq){
//           System.out.println(i);
//       }
   
    while(!pq.isEmpty()){
        System.out.println(pq.poll());
        
    }
    }
    
}
