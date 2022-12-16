package com.ThreadingJava;

// NEW
// A thread will be in NEW state before calling the start() method. 

public class JavaThreadLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread();
		
		// Checking the state before starting the thread
		try {
			Thread.sleep(2000);
			System.out.println("Thread is awake");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getState()); // output: NEW
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.isAlive());
		System.out.println(thread.isDaemon());
		
		System.out.println("-------starting thread-------");
		
		thread.start();
		
		System.out.println(thread.getState()); // output: RUNNABLE
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.isAlive());
		System.out.println(thread.isDaemon());
	}

}
