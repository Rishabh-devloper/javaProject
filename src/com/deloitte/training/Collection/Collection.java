package com.deloitte.training.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {
	public static void main(String[] args) {
		
		ArrayList<Integer> blist = new ArrayList<Integer>(Arrays.asList(100,34,53,781,90,39,79,857));
		
//		System.out.println("For each lopp");
//		for (Integer i : blist) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//		System.out.println(blist);
		 
//		Iterator<Integer> it = blist.iterator();


//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
		
		
//		while(it.hasNext()) {
//			Integer i = it.next();
//			if(i%2!=0) {
//				it.remove();
//			}
//		
//		}
//		System.out.println(blist);
//		
		
		ListIterator<Integer> lit = blist.listIterator();
		
		lit.add(69);
		System.out.println(lit.hasPrevious());
		System.out.println(lit.hasNext());
		lit.next();
		
		lit.hasPrevious();
		lit.next();
;		
	}

}
