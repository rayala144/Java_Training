package com.returnTypeExample;
import java.util.Scanner;

public class Bank {
	
	private int balance = 0;
	
	public void depositAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int deposit_Amount = sc.nextInt();
		balance = balance + deposit_Amount;
		System.out.println("Amount credited "+"$"+deposit_Amount);
		sc.close();
	}

	public String getBalance() {
		return ("Your current balance is "+"$"+balance);
	}

	
	

}
