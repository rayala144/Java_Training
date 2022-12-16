package com.collections.MapExamples;

import java.util.HashMap;

public class TestCourse {
	
	static void print(Object k) {
		System.out.println(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course(10, "Python");
		Course c2 = new Course(11, "Java");
		
		HashMap<Integer, String> obj = new HashMap<>();
		obj.put(c1.courseID, c1.courseName);
		obj.put(c2.courseID, c2.courseName);
		
		print(obj);
				
	}

}
