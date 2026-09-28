package com.deloitte.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(45,69,75,2,89,2,10));
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println(Collections.binarySearch(list,89));
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.min(list));
//		
//		System.out.println(list);
//		Collections.shuffle(list);
//		System.out.println(list);
		
		
//		Vector<String> svector = new Vector<String>(Arrays.asList("rishabh", "hi" ,"aman" ,"ball" ,"zebra" , "owl"));
//		Collections.sort(svector);
//		System.out.println(svector);
//		System.out.println(Collections.binarySearch(svector, "ball"));
//		Collections.reverse(svector);
//		System.out.println(svector.firstElement());
		int[] arr = {5,6,7,3,23,96,1,24};
		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, 96));
//		for (int i : arr) {
//			System.out.println(i);
//		}
		int[] brr = Arrays.copyOf(arr, 3);
		for (int i : brr) {
			System.out.println(i);
		}
	}

}
