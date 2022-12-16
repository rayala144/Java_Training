package com.collections.MapExamples;

import java.util.HashMap;

public class TestStudent {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1100, "Kate", 'A');
		Student s2 = new Student(1101, "John", 'B');
		Student s3 = new Student(1102, "Giri", 'A');
		Student s4 = new Student(1103, "Stella", 'C');
		Student s5 = new Student(1104, "Ruth", 'D');
		
		HashMap<Integer, Character> obj = new HashMap<>();
		obj.put(s1.StuID, s1.stuGrade);
		obj.put(s2.StuID, s2.stuGrade);
		obj.put(s3.StuID, s3.stuGrade);
		obj.put(s4.StuID, s4.stuGrade);
		obj.put(s5.StuID, s5.stuGrade);
		
		System.out.println(obj);
		
	}

}
