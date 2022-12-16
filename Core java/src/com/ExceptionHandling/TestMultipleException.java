package com.ExceptionHandling;

import java.util.Scanner;

public class TestMultipleException {

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
		} catch (NullPointerException n) {
			// TODO: handle exception
			n.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
