package com.singleton.ThreadSafe;

public class ThreadSafeExample {

	private ThreadSafeExample() {
		// TODO Auto-generated constructor stub
	}
	
	private static ThreadSafeExample instance;
	
	// using double checking locking principle
	public static ThreadSafeExample getInstance() {
		if(instance == null) {
			synchronized (ThreadSafeExample.class) {
				if(instance == null) {
					instance = new ThreadSafeExample();
				}
			}
		}
		return instance;
	}
	
	
}
