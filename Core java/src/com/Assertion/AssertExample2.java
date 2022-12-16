package com.Assertion;

import java.util.Scanner;

public class AssertExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		
		int value = sc.nextInt();
		assert (value % 2 == 0); // check if value is even
		System.out.println(value + " is even");
		
		sc.close();

	}

}
