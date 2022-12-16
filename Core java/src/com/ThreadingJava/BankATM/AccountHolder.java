package com.ThreadingJava.BankATM;

public class AccountHolder implements Runnable {
	private Account account;
	
	public AccountHolder (Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 4; i++) {
			makeWithDrawl(2000);
			
			if(account.getBalance() < 0) {
				System.out.println("Account is overdrawn");
			}
		}
	}
	
	private synchronized void makeWithDrawl(int withDrawlAmount) {
		if (account.getBalance() >= withDrawlAmount) {
System.out.println(Thread.currentThread().getName()+" is going to withdraw $"+withDrawlAmount);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ex) {
				// TODO: handle exception
				ex.printStackTrace();
			}
			account.withDraw(withDrawlAmount);
System.out.println(Thread.currentThread().getName()+" completes the withdrawl of $"+withDrawlAmount);
	} else {
System.out.println("Not enough in account for "+Thread.currentThread().getName()+". Balance = "+account.getBalance());
	}
}
	
}
