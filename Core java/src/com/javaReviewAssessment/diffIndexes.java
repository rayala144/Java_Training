package com.javaReviewAssessment;


public class diffIndexes {

	public static void main(String[] args) {

		String myStr = "     Hello planet earth, you are a planet and also a great planet  ";
		int last_index = myStr.lastIndexOf("planet"); // last occurrence
		int first_index = myStr.indexOf("planet"); // first occurrence 
		int first_index_from = myStr.indexOf("planet", 10); // first occurrence from a specific index
		
		
		
		System.out.println("-----------For a character-----------");
		int last_index_char = myStr.lastIndexOf('p'); // last occurrence
		int first_index_char = myStr.indexOf('p'); // first occurrence 
		int first_index_from_char = myStr.indexOf('p', 10); // first occurrence from a specific index
		
		
		int[] indexes = {last_index, first_index, first_index_from, last_index_char, first_index_char, first_index_from_char};
		
		// System.out.println(myStr.stripIndent());
		
		for(int i:indexes) {
			System.out.println(i);
		}
		
		
		
		 
	}
	
	
		

}
