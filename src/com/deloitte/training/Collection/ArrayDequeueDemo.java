package com.deloitte.training.Collection;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		adq.offer(1);
		adq.offerFirst(2);
		adq.offerLast(9);
		adq.offer(6);
		System.out.println(adq);
		System.out.println(adq.pop());
		System.out.println(adq);
		
		
	}

}
