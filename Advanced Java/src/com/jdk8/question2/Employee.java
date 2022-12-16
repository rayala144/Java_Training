package com.jdk8.question2;

public class Employee {
	int empID;
	String empName;
	String location;
	double empSalary;
	
	public Employee(int empID, String empName, String location, double empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.location = location;
		this.empSalary = empSalary;
	}

	public String getLocation() {
		return location;
	}
	
	
}
