package com.keyword.thisKeyword;

public class ThisMethodConstrOvrLdng {
	
	static class Employee{
		String empName;
		int empID;
		String empCity;
		
		public Employee(String empName, int empID) {
			super();
			this.empName = empName;
			this.empID = empID;
			// System.out.println("Name: "+empName+", ID: "+empID);
		}
		
		public Employee (String empName, int empID, String empCity) {
			this(empName, empID); // uses the above constructor
			this.empCity = empCity;
			// System.out.println("City: "+empCity);
		}

		@Override
		public String toString() {
			if (empCity == null) {
			return "Employee [empName=" + empName + ", empID=" + empID+"]";
			}
			else { 
				return "Employee [empName=" + empName + ", empID=" + empID+", empCity="+empCity+"]";
			}
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Akhil", 10001);
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee("Vikram", 10002, "Los Angeles");
		System.out.println(emp2.toString());
		
	}

}
