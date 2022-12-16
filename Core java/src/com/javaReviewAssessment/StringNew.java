package com.javaReviewAssessment;

public class StringNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Welcome";
		
		String s3 = "Hello";
		String s4 = "hello";
		
		String s5 = new String("hello");
		String s6 = new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s5.equals(s6));
		
		System.out.println(s5 == s6);
	}

}
