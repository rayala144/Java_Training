package com.singleton.lazyInitialization;

public class TestSingletonLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calling getInstance() method many times
		 * returns same hash-code that proves that
		 * singleton class only creates one instance
		 */
		
		SingletonLazy s1 = SingletonLazy.getInstance();
		SingletonLazy s2 = SingletonLazy.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
