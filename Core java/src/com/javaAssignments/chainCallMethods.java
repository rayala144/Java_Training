package com.javaAssignments;

public class chainCallMethods {
	
	public void name() {
		System.out.println("This is my name");
		greet();
	}
	
	public void greet() {
		humanify();
		System.out.println("Hi human!!!");
	}
	
	public void humanify() {
		System.out.println("I'm a human now!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chainCallMethods human = new chainCallMethods();
		human.name();
	}

}
