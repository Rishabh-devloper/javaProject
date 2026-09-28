package com.deloitte.training.set;

import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(1);
		tSet.add(98);
		tSet.add(79);
		tSet.add(69);
		tSet.add(86);
		System.out.println(tSet);
		
		tSet.remove(86);
		System.out.println(tSet.getFirst());
		
		
	}

}
