package com.collections.HashSetExample;

import java.util.HashSet;
import java.util.Set;

public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> obj = new HashSet<>();
		
		Student s1 = new Student(1010, "A", 20);
		Student s2 = new Student(1011, "B", 22);
		Student s3 = new Student(1012, "C", 21);
		Student s4 = new Student(1013, "D", 19);
		Student s5 = new Student(1014, "E", 23);
		Student s6 = new Student(1015, "F", 22);
		
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		obj.add(s5);
		obj.add(s6);
	}

}
