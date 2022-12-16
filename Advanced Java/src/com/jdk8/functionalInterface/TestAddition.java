package com.jdk8.functionalInterface;

@FunctionalInterface
interface Rectangle {
	public abstract void perimeter(int x, int y);
}

public class TestAddition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = (int x, int y) -> {
			System.out.println("Perimeter: "+2*(x+y));
		};
		obj.perimeter(8, 21);

	}

}
