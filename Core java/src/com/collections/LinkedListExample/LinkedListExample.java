package com.collections.LinkedListExample;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> obj = new LinkedList<>();
		obj.add(29);
		obj.add(34);
		obj.add(2, 56);
		obj.add(19);
		obj.add(89);
		obj.set(3, 20);
		
		System.out.println(obj);
		// System.out.println(obj.element());// obj.element();
	}

}
