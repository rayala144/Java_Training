package com.nt.multiThreading;

class MyThread6 extends Thread {
	
}


public class ThreadPriorityDemo {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// default priority = 9
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		MyThread6 mt = new MyThread6();
		System.out.println(mt.getPriority());
		mt.sleep(100);
		System.out.println(mt.getState());
	}
	
	

}
