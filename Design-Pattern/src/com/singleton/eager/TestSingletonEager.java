package com.singleton.eager;

public class TestSingletonEager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEager s1 = SingletonEager.getInstance();
		SingletonEager s2 = SingletonEager.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		// SingletonEager obj = new SingletonEager(); // Cannot create new instances with a private constructor
		
	}

}
