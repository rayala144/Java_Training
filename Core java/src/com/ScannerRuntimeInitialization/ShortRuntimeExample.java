package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class ShortRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 shorts: ");
	short a, b, c;
	a=sc.nextShort();
	b=sc.nextShort();
	c=(short)(a+b);
	System.out.println("Addition of two shorts:\t"+c);
	sc.close();
	}
}
