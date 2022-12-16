package com.singleton.staticExample;

public class SingletonStatic {
	
	private SingletonStatic() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonStatic instance = null;
	static String name = "static method";
	
	static {			// static block --> given first priority by JVM
		try {
			if(instance == null) {
				instance = new SingletonStatic();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static SingletonStatic getInstance() {
		System.out.println(name);
		return instance;
	}
	
	
}
