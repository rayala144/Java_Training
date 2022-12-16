package com.nt.multiThreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i <= 10 ; i++) {
			System.out.println("Child thread");
		}
	}
	
	synchronized public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mRunnable = new MyRunnable();
		Thread thread = new Thread(mRunnable);
		thread.start();
		for(int h = 0 ; h <= 10 ; h++) {
			System.out.println("main thread");
		}
	}

	

}
