package com.javaReviewAssessment;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Mutable
		StringBuilder strBuilder = new StringBuilder("Happy birthday");
		strBuilder.delete(1, 3);
		System.out.println(strBuilder);
		
		
		// Immutable
		String str = "Happy birthday";
		System.out.println(str.replace('p', 'd'));
		// replace() method returns a new string instead of changing the old string
		

	}

}
