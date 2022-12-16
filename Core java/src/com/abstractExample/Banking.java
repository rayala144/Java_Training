package com.abstractExample;

import java.util.Scanner;

abstract class Bank{
	
	static int balance = 1500;
	
	void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the deposit Amount: ");
		int depositAmnt = sc.nextInt();
		balance = balance + depositAmnt;
		System.out.println("Your account is credited with "+depositAmnt+" and your balance is "+balance);
		sc.close();
	}
	
	
	public abstract void withDraw();
}


class Shopping extends Bank{
	@Override
	public void withDraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Shopping - Enter shopping amount: ");
		int shopAmnt = sc.nextInt();
		Shopping.balance -= shopAmnt;
		System.out.println("Rs."+shopAmnt+" has been debited from your account");
		System.out.println("New balance: "+Shopping.balance);
		sc.close();
	}
}


class ATM extends Bank{
	@Override
	public void withDraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ATM - Enter withdrwal amount: ");
		int withDrawAmnt = sc.nextInt();
		Shopping.balance -= withDrawAmnt;
		System.out.println("Rs."+withDrawAmnt+" has been withdrawn from your account");
		System.out.println("New balance: "+Shopping.balance);
		sc.close();
	}
}


class Purchase extends Bank{
	@Override
	public void withDraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Purchase - Please enter the bill amount: ");
		int product_cost = sc.nextInt();
		Shopping.balance -= product_cost;
		System.out.println("Rs."+product_cost+" has been withdrawn from your account");
		System.out.println("New balance: "+Shopping.balance);
		sc.close();
}
	
}

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping sobj = new Shopping();
		sobj.deposit();
		sobj.withDraw();
		
		ATM aobjAtm = new ATM();
		aobjAtm.deposit();
		aobjAtm.withDraw();
		
		Purchase product = new Purchase();
		product.withDraw();

	}

}

