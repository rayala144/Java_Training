package com.keyword.finalExample;

public class TestStatic {

	static final String dataspeed;
	
	static {
		dataspeed = "Your data speed is 400 mbps";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TestStatic.dataspeed);
	}

}
