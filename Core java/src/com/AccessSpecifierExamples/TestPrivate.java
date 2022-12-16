package com.AccessSpecifierExamples;

class Bank{
	private int pinNumber = 1234;
}
public class TestPrivate {

	public static void main(String[] args) {
		Bank sbi = new Bank();
		// System.out.println(sbi.pinNumber); // cannot access pinNumber, change from private to public
	}
	
}
