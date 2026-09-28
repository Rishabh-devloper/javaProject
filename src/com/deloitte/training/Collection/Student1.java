package com.deloitte.training.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student1 {
public static void main(String[] args) {
	
	ArrayList<Student> stu1= new ArrayList<Student>();
	
	stu1.add(new Student(21,"rishabh" , 20 ,"BCA"));
	stu1.add(new Student(22,"mishra" , 21 ,"BCA"));
	stu1.add(new Student(23,"rohit" , 70 ,"BCA"));
	stu1.add(new Student(25,"ris" , 29 ,"BCA"));
	stu1.add(new Student(26,"shabh" , 25 ,"BCA"));
	
	 Iterator<Student> it = stu1.iterator();
	 Iterator<Student> it2 = stu1.iterator();
	
	 while(it.hasNext()) {
		 if(it.next().getAge()>25) {
			 it.remove();
		 }
		 
	 }
	 System.out.println(stu1);
	 
	 while(it2.hasNext()) {
		 Student stu = it2.next();
		 String oldname = stu.getName();
		 String newname= oldname.toUpperCase();
		 
		 stu.setName(newname);
	 }
	 System.out.println(stu1);
	
}
}
