package com.nt.multiThreading;

public class MyThread1 extends Thread{
	
	public void start() {
		System.out.println("Starting methods");
	}
	
//	public void run(int g) {
//		System.out.println("int arg method: " + g);
//	}
	
	public void run() {
		System.out.println("run methods");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mThread1 = new MyThread1();
		mThread1.start();
		System.out.println("main methods");
	}

}
