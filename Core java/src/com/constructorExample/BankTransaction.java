package com.constructorExample;

public class BankTransaction {
	int accNo;
	String candidateName;
	int pin;
	int otp;
	int depositAmount;
	int balance = 0;
	long mobileNumber;
	
	
	BankTransaction() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to HDFC Bank!");
	}
	BankTransaction(String name, int accountNumber){
		candidateName = name;
		accNo = accountNumber;
	}
	
	BankTransaction(int pin, int otp){
		this.pin = pin;
		this.otp = otp;
	}
	
	BankTransaction(int amnt, long mobile){
		depositAmount = amnt;
		balance = balance + depositAmount;
		mobileNumber = mobile;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "accNo=" + accNo + ", candidateName=" + candidateName + ", pin=" + pin + ", otp=" + otp
				+ ", depositAmount=" + depositAmount + ", balance=" + balance + ", mobileNumber=" + mobileNumber;
	}
	
	

}
