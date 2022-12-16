package com.collections.TreeSetExample;

import java.util.TreeSet;
import java.util.Set;


public class TestBook {

	public static void main(String[] args) {
		TreeSet<Book> obj1 = new TreeSet<Book>();
		obj1.add(new Book(1110, "Bible", 1200));
		obj1.add(new Book(1111, "Never Never", 400));
		obj1.add(new Book(1112, "Subtle art of not givivng a f***", 200));
		obj1.add(new Book(1113, "Rich Dad Poor Dad", 300));
		System.out.println(obj1);
	}

}
