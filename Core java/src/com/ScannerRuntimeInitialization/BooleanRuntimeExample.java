package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class BooleanRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 statements: ");
	boolean a, b, c;
	a=sc.nextBoolean();
	b=sc.nextBoolean();
	c=(a&&b);
	System.out.println("AND of two statements:\t"+c);
	sc.close();
	}
}
