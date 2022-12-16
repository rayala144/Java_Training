package com.jdk8.functionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface University {
	public abstract int universityNameLength(String name);
}

public class TestRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University obj = (String name) -> {
			return name.length();
		};
		
		System.out.print("Enter University name: ");
		Scanner scanner = new Scanner(System.in);
		String university_name = scanner.nextLine();
		int size = obj.universityNameLength(university_name);
		System.out.println("Length: "+size);
		scanner.close();

	}

}
