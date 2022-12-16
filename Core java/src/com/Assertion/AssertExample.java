// Java program to demonstrate syntax of assertion
package com.Assertion;
import java.util.Scanner;

public class AssertExample {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int value = sc.nextInt();
		assert value >= 40 :"Underweight";
		System.out.println("Your weight is " + value);
	}
}
