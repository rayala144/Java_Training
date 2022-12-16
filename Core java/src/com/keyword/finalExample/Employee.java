package com.keyword.finalExample;

public class Employee {
	
	int empID;
	String empName;
	final String PAN_CARD_NUMBER;
	
	
	public Employee(int empID, String empName, String PAN_CARD_NUMBER) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.PAN_CARD_NUMBER = PAN_CARD_NUMBER;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", PAN_CARD_NUMBER=" + PAN_CARD_NUMBER + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(102341, "Akhil", "CWEPA3557Q"); // name and empID can be changed later but PAN card is fixed
		System.out.println(emp.toString());

	}

}
