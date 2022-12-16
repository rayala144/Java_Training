package com.singleton.BillPugh;

public class TestBillPugh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleBillPugh s1 = SingleBillPugh.getInstance();
		SingleBillPugh s2 = SingleBillPugh.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
	}

}
