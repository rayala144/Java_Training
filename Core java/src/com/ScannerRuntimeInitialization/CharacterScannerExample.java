package com.ScannerRuntimeInitialization;
import java.util.Scanner;

public class CharacterScannerExample {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter gender");
	char Gender;
	Gender = sc.next().charAt(0);
	System.out.println("Your gender is:\t"+Gender);
	sc.close();
	}
}
