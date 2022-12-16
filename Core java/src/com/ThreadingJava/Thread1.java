package com.ThreadingJava;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finding the current thread");
		Thread thread = Thread.currentThread();
		Thread thread1 = new Thread();
		
	
//		thread.setName("Running thread"); // assigning new name for the current thread
//		System.out.println("Thread's new information "+thread);
//		System.out.println("New name of main thread: "+thread.getName()+" , "+thread.isAlive());
		
		System.out.println(thread.getState()); // output: NEW
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		System.out.println(thread.isAlive());
		System.out.println(thread.isDaemon());
		
		
		
		System.out.println("----------------------");
		thread1.setDaemon(true);
		thread1.start();
		
		System.out.println(thread1.getState()); // output: NEW
		System.out.println(thread1.getName());
		System.out.println(thread1.getPriority());
		System.out.println(thread1.isAlive());
		System.out.println(thread1.isDaemon());
		
		
	}

}
