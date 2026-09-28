package com.deloitte.training.objectdemo;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="DELOITTE";
		String n= new String("deloitte");
		
	String  org= "Deloitte Consulting Services";
		
		String stArray[] = org.split(" ");
		System.out.println(stArray[2]);
		
		System.out.println(name.equals(n));
		System.out.println(name.equalsIgnoreCase(n));
		System.out.println(name.indexOf('E'));
		System.out.println(name.lastIndexOf('T'));
		System.out.println(org.trim());
		System.out.println(name.toLowerCase());
		System.out.println(n.toUpperCase());
		System.out.println(org.toCharArray());
		System.out.println(name.compareTo(n));
		System.out.println(name.substring(2, 7));
	}

}
