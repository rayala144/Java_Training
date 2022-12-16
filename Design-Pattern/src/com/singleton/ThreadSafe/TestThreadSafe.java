package com.singleton.ThreadSafe;

public class TestThreadSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeExample s1 = ThreadSafeExample.getInstance();
		ThreadSafeExample s2 = ThreadSafeExample.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
