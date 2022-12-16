package com.collections.MapExamples;

public class Employee {
	int EmpID;
	String EmpName;
	int salary;
	
	public Employee(int empID, String empName, int salary) {
		super();
		EmpID = empID;
		EmpName = empName;
		this.salary = salary;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("----------");
		System.out.println("Employee ID: "+getEmpID()+", Employee Name: "+getEmpName()+", Salary: "+getSalary());
	}
	
}
