package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class DoubleRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 doubles: ");
	double a, b, c;
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=(a+b);
	System.out.println("Addition of two doubles:\t"+c);
	sc.close();
	}
}
