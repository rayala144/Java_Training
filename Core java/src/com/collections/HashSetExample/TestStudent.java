package com.collections.HashSetExample;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> obj = new HashSet<>();
		obj.add(new Student(101, "Akhil", 21));
		obj.add(new Student(102, "Tarun", 20));
		obj.add(new Student(103, "Akash", 23));
		System.out.println(obj);
	}

}
