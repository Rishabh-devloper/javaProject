package com.deloitte.entity;

public abstract class DeloitteEmployee {
	int empid ;
	String name;
	float salary;
	double yearofexperinece;
	
	public DeloitteEmployee() {
		System.out.println("parent constructor");
	}
	public void genrateid() {
		System.out.println(empid);
		System.out.println(name);
	}
	
	public abstract void promotion();

}
