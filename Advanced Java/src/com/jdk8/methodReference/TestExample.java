package com.jdk8.methodReference;

@FunctionalInterface
interface IClass {
	public void hi();
}

public class TestExample {

	public static void main(String[] args) {
		
		IClass obj = () -> {
			System.out.println("Hi welcome to Wakanda Forever");
		};
		obj.hi();
		
	}
	
}
