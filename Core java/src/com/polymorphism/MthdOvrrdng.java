package com.polymorphism;


class Bingo {
	
	void getName(String name) {
		System.out.println("Your name is "+name);
	}
}

public class MthdOvrrdng extends Bingo{

	void getName(String name) {
		System.out.println("Name of yours is "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthdOvrrdng obj = new MthdOvrrdng();
		obj.getName("Vikram");

	}

}
