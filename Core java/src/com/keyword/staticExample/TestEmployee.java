package com.keyword.staticExample;

public class TestEmployee {
	
	static class Employee{
		int empID;
		String empName;
		static String cmpName = "hcl";
		
		public Employee(int empID, String empName) {
			super();
			this.empID = empID;
			this.empName = empName;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee(101, "Akhil");
		System.out.println(obj1.empID+", "+obj1.empName+", "+Employee.cmpName);
		Employee obj2 = new Employee(102, "Bheem");
		System.out.println(obj2.empID+", "+obj2.empName+", "+Employee.cmpName);
		
	}

}
