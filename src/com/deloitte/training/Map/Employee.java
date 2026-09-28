package com.deloitte.training.Map;

public class Employee {
	private int empId;
	private String name;
	private String department;
	private int salary;
	private int exp;
	private String city;
	
	
	
	
	
	public Employee(int empId, String name, String department, int salary, int exp, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.exp = exp;
		this.city = city;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "[empId=" + empId + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", exp=" + exp + ", city=" + city + "]";
	}
	
	
	
	
	
}
