package com.singleton.eager;

public class SingletonEager {
	
	// Private Constructor
	private SingletonEager() {
		// TODO Auto-generated constructor stub
	}
	
	// Global access point created for single instance
	public static final SingletonEager INSTANCE = new SingletonEager();
	
	// Global access method for accessing the above instance
	public static SingletonEager getInstance() {
		return INSTANCE;
	}
	
}
