package com.deloitte.training.Collection;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	public Student() {
		super();
		rollNo=21;
		name="Rishabh";
		age=20;
		course="BTECH";
	}
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public Student (int rollNo , String name , int age, String course){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.course=course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return this.rollNo-o.rollNo;
	}
	

}
