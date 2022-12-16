package com.constructorExample;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransaction obj = new BankTransaction();
		BankTransaction obj1 = new BankTransaction("Akhil", 13125326);
		BankTransaction obj2 = new BankTransaction(2425, 4575);
		BankTransaction obj3 = new BankTransaction(2252, 9182674883l);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}