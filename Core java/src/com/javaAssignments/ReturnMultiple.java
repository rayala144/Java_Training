package com.javaAssignments;
import java.util.*;

public class ReturnMultiple {

	public List<Object> marks() {
		int a = 12;
		String b = "Gradient";
		long c = 6732634;
		
		return Arrays.asList(a,b,c);
	}
		
	
	
	public static void main(String[] args) {
		ReturnMultiple obj=new ReturnMultiple();
		System.out.println(obj.marks());
		

	}

}
