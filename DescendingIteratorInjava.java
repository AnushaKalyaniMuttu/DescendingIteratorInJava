package com.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DescendingIteratorInJava {
		
	
	public static void main (String [] args) {
        Deque<Integer> deque = new ArrayDeque<>();
    
      deque.addFirst(1);
      deque.addFirst(2);
      deque.addFirst(3);
    
      System.out.println(deque);
      
     Iterator<Integer> desc= deque.descendingIterator();
     while(desc.hasNext()) {
    	 System.out.print(desc.next());
     }
   

			}
	
}
