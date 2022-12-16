package com.singleton.SingletonEnum;

public class TestSingletonEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEnum s1 = SingletonEnum.GETINSTANCE;
		SingletonEnum s2 = SingletonEnum.GETINSTANCE;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String welcome = s1.welcome();
		System.out.println(welcome);
	}

}
