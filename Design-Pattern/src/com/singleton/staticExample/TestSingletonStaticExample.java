package com.singleton.staticExample;

public class TestSingletonStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonStatic static1 = SingletonStatic.getInstance();
		SingletonStatic static2 = SingletonStatic.getInstance();
		SingletonStatic static3 = SingletonStatic.instance;
		
		System.out.println(static1.hashCode());
		System.out.println(static2.hashCode());
		System.out.println(static3.hashCode());
		System.out.println(SingletonStatic.name.toUpperCase());
		
	}

}
