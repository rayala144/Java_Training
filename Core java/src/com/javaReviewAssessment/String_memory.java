package com.javaReviewAssessment;

public class String_memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Strings are stored in the heap space of JAVA Virtual Machine
		
		
		 //String literal - stored in the Java Constant Pool
		 String str = "Welcome";
		 String str1 = "Welcome";
		 
		 //String object - stored in the Java Heap Space
		 String str2 = new String("Hello");
		 String str3 = new String("Hello");
		 
		 if (str == str1) {
			 System.out.println("True");
			 
		 }
		 else {
			 System.out.println("false");
		 }
		 // System.out.println(str2);
		 
		 
	}

}
