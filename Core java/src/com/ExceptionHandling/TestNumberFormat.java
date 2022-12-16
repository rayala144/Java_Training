package com.ExceptionHandling;

import java.util.Scanner;

public class TestNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();
		
		try {
			Integer a = new Integer(c);
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println(e); // --> print the error
			// e.printStackTrace(); // --> line of exception, name of the exception, description of the exception
			 System.out.println(e.getMessage()); // --> gives only the description of the exception
			 System.out.println(e.toString()); // --> gives only the line number
			
		}
		
		finally {
			System.out.println("good bye!!!");
			scan.close();
		}
		
	}

}
