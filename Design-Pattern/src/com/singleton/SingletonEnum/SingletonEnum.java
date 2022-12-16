package com.singleton.SingletonEnum;

public enum SingletonEnum {
	/*
	 * This singleton can be accessed globally
	 */
	GETINSTANCE;
	
	public String welcome() {
		return "Welcome to Singleton";
	}
}
