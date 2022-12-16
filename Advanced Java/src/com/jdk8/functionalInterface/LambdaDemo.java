package com.jdk8.functionalInterface;


@FunctionalInterface
interface Demo {
	public abstract void test();
	
	default void add() {
		System.out.println("Default method is called...");
	}
	
	static void sub() {
		System.out.println("Static method is called...");
	}
}

public class LambdaDemo implements Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new LambdaDemo();
		obj.add();
		// obj.test();
		Demo.sub();
		
		Demo id = () -> System.out.println("THIS IS A DEMO METHOD");
		id.test();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("This is a test");
		
	}

}
