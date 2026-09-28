package com.deloitte.training.objectdemo;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private float salary;
	
	
	
	
	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.empId==emp.empId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
		
	}
	
}
