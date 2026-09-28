package com.deloitte.training.objectdemo;

public class HandsOn {
	public static void main(String[] args) {
		String sent= "  Java   foundation training is going on";
		System.out.println(CalSpace(sent));
		
	}
	public static int CalSpace(String text) {
		int count = 0;
		
		for(int i=0 ; i<text.length();i++) {
			if(text.charAt(i)==' ') {
				count++;
			}
		}
		return count;
		
	}
}
