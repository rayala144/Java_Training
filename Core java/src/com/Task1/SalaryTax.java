package com.Task1;

import java.util.Scanner;

// import com.javaAssignments.intReturnType;

public class SalaryTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter salary: ");
		double salary = scanner.nextInt();
		if (salary <= 10000) {
			salary = salary - ((salary*5)/100);
		}
		else {
			salary = salary - ((salary*10)/100);
		}
		
		System.out.println("Salary after tax: "+salary);
			

	}

}
