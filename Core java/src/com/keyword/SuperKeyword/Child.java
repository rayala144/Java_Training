package com.keyword.SuperKeyword;


class Parent{
	
	int balance = 100000000;
	String assets = "Our assets";
	
	public String getDetails() {
		return "Parent [Bank balance=" + balance + ", assets=" + assets + "]";
	}
	
}

public class Child extends Parent{
	
	public void get_Property() {
		System.out.println(super.getDetails());
		System.out.println("The above property is mine now!!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.get_Property();
		System.out.println(child.balance);
	}

}
