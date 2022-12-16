package com.ExceptionHandling;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try (Scanner sc = new Scanner(System.in)) {
			/* try(k) where k is a parameter of try block, 
			   this is called try with resources
			 */
			System.out.println("Enter 2 numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a*b;
			System.out.println("Product of two numbers: "+c);
		} 

	}

}
