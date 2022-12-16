package com.collections.HashSetExample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> obj = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Enter Student ID: ");
			int ID = sc.nextInt();
			System.out.println("Enter Student name: ");
			String name = sc.next();
			System.out.println("Enter Student age: ");
			int age = sc.nextInt();
			Student student = new Student(ID, name, age);
			obj.add(student);
		}
		
		System.out.println(obj);
		sc.close();
	}

}
