package com.deloitte.training.Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> intlist = new Vector<Integer>();
		
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		intlist.add(5);
		intlist.add(6);
		intlist.add(7);
		Iterator<Integer> it = intlist.iterator();
		while(intlist.isEmpty()) {
			Integer a= it.next()  ;
			intlist.set(a*a*a, a);
			
		}
		System.out.println(intlist);
	}

}
