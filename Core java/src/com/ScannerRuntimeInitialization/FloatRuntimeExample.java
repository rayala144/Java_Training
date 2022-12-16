package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class FloatRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 floats: ");
	float a, b, c;
	a=sc.nextFloat();
	b=sc.nextFloat();
	c=(a+b);
	System.out.println("Addition of two floats:\t"+c);
	sc.close();
	}
}
