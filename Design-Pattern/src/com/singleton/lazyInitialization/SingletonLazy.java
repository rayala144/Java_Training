package com.singleton.lazyInitialization;

public class SingletonLazy {

	private SingletonLazy() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLazy instance = null;
	
	public static SingletonLazy getInstance() { 
		// This method has global access to return, @return single instance
		// If instance is null, only then initiate
		
		if(instance == null) {
			instance = new SingletonLazy();
		}
		
		System.out.println("Instance is created..");
		return instance;
	}
	
	
}
