package com.structural.adapterDesignPattern;

public class TestAdapterDesignPattern {

	public static void main(String[] args) {
		// creating WallSocket object
		WallSocket wallSocket = new WallSocketImpl();
		// Generating 240 volts by default
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);
		System.out.println("------------------------");
		
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		System.out.println(mobileAdapter.get3Volt());
	}
}
