package com.jdk8.functionalInterface;

@FunctionalInterface
interface X {
	public abstract String example();
		
}

//class Y implements X{
//
//	@Override
//	public void example() {
//		// TODO Auto-generated method stub
//		System.out.println("Welcome to functional inteface");
//	}
//	
//}

public class TestFunctional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Y obj = new Y();
//		obj.example();
		X ref = () -> {
			System.out.println("Hi...this is created using lambda");
			return "Hi";
		};
		ref.example();
		
	}

}
