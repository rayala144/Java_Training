package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class StringScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name;
		name=sc.nextLine();
		// sc.next() --> for reading the string only till the first space occurs
		System.out.println("Your name:\t"+name);
		sc.close();
	}
}
