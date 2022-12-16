package com.creational.factoryDesignPattern;

public interface Computer {
	
	public String ram();
	public String hdd();
	public String cpu();
	
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
	
}
