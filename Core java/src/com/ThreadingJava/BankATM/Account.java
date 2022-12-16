package com.ThreadingJava.BankATM;

public class Account {
	private int balance = 10000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withDraw(int amount) {
		balance = balance - amount;
		System.out.println("Amount "+amount+" withdrawn");
	}
	
}
