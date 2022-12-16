package com.ExceptionHandling;

import java.util.Scanner;

public class TestMulticatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println(c);
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Input mismatch - please provide correct input");
		}
		

	}

}
