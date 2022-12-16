package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class LongRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers: ");
	long a, b, c;
	a=sc.nextLong();
	b=sc.nextLong();
	c=(a+b);
	System.out.println("Addition of two numbers:\t"+c);
	sc.close();
	}
}
