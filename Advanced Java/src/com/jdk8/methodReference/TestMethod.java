package com.jdk8.methodReference;

@FunctionalInterface
interface K {
	public abstract void calculate(int x);
}

class B {
	public static void square(int a) {
		System.out.println("Square value is " + a*a);
	}
}

public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		K obj = B :: square;
		obj.calculate(6);
		
	}

}
