package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class IntegerRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers: ");
	int a, b, c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=(a+b);
	System.out.println("Addition of two numbers:\t"+c);
	sc.close();
	}
}
