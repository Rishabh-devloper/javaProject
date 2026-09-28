package com.deloitte.training.Collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("hi");
		ll.add("hello");
		ll.push("Mishra");
		ll.offer("Rishabh");
		ll.offerFirst("one");
		ll.poll();
		System.out.println(ll);
	}
}
