package com.oopsExample;

class Employee{
	
	public void getEmpDeails(String name, int empID, String phone_number) { // parameters
		System.out.println("Name: " + name);
		System.out.println("ID: " + empID);
		System.out.println("Phone number: " + phone_number);
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.getEmpDeails("Akhil", 52114568, "9182674883"); // arguments
		
	}

}
