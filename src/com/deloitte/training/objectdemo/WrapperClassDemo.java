package com.deloitte.training.objectdemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj3=100;
		
		int a=10;
		Integer obj =10;
		
		int b=obj;
		Integer obj2=b;
		
		Integer obj4=98;
		
		
		
		Integer[] intArray = new Integer[10];
		
		intArray[0]=obj;
		intArray[1]=obj2;
		intArray[2]=obj3;
		intArray[3]=obj4;
		for (Integer integer : intArray) {
			System.out.println(integer);
		}
		
	}

}
