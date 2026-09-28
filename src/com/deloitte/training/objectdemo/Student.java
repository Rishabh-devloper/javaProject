package com.deloitte.training.objectdemo;

public class Student {
	private int studid;
	private String name;
	private double percentage;
	
	public Student(int studid, String name, double percentage) {
		super();
		this.studid = studid;
		this.name = name;
		this.percentage = percentage;
	}

	
	
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", percentage=" + percentage + "]";
	}



	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
		
	
}
