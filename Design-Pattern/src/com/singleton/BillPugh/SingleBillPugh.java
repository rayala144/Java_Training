package com.singleton.BillPugh;

public class SingleBillPugh {


	private SingleBillPugh() {
		// TODO Auto-generated constructor stub
	}
	
	private static class SingletonHolder {
		public static final SingleBillPugh instance = new SingleBillPugh();
	}
	
	public static SingleBillPugh getInstance() {
		return SingletonHolder.instance;
	}
	
	
}
