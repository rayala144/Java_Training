package com.AccessSpecifierExamples;

class Employee1{
	protected int empID = 2002;
}

public class TestProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1();
		System.out.println(emp.empID); // can access empID
	}

}
