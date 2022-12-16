package com.jdk8.functionalInterface;

@FunctionalInterface
interface Course {
	public abstract int courseNameLength(String name);
}

public class TestReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = (String name) -> {
			return name.length();
		};
		
		int len = c1.courseNameLength("Quantum Physics");
		System.out.println("Lenght of course name: "+len);
	}

}
