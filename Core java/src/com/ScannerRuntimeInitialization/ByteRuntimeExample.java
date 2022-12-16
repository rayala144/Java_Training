package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class ByteRuntimeExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers: ");
	byte a, b, c;
	a=sc.nextByte();
	b=sc.nextByte();
	c=(byte)(a+b);
	System.out.println("Addition of two numbers:\t"+c);
	sc.close();
	}
}
