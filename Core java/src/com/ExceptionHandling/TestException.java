package com.ExceptionHandling;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 0;
		
		try {
			int c = a/b;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
