package com.deloitte.training.objectdemo;

public class Starter {
	public static void main(String[] args) {
		Employee e1= new Employee(1,"Rish",9000);
		Employee e2 = new Employee(2,"mish",8000);
		Employee e3 = new Employee(1,"Rish",9000);
		
		Employee[] emp_arr= new Employee[3];
		
		emp_arr[0]=e1;
		emp_arr[1]=e2;
		emp_arr[2]=e3;
		
		for(int i=0; i<3;i++) {
			System.out.println(emp_arr[i].getEmpName());
		}
		for (Employee employee : emp_arr) {
			System.out.println(employee.getSalary());
		}
	}
}
