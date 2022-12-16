package com.AccessSpecifierExamples;


class A{
	public int x = 100; // write static to directly access x without creating A object
	
	public void display() {
		System.out.println("You have accessed a public method");
	}
}

public class TestPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.x);
	}

}
