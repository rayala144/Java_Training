package com.javaAssignments;

public class ReturnObject {
	
	ReturnObject() {
		// TODO Auto-generated constructor stub
		System.out.println("object is returned");
	}
	
	public ReturnObject returnMethod() {
		ReturnObject obj = new ReturnObject();
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnObject obj1 = new ReturnObject();
		System.out.println(obj1.returnMethod());

	}

}
