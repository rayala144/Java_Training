package com.singleton.reflection;

public class SingletonReflection {
	
	private SingletonReflection() {
		
	}
	
	private static SingletonReflection INSTANCE = null;
	
	public  static SingletonReflection getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonReflection();
		}
		return INSTANCE;
	}
	
}
