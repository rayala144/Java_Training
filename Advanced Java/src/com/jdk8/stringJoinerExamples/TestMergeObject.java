package com.jdk8.stringJoinerExamples;

import java.util.StringJoiner;

public class TestMergeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner obj1 = new StringJoiner("-", "[", "]");
		obj1.add("Apple");
		obj1.add("Banana");
		obj1.add("Orange");

		StringJoiner obj2 = new StringJoiner("*");
		obj1.add("red");
		obj1.add("Yellow");
		obj1.add("Orange");

		StringJoiner obj3 = obj1.merge(obj2);
		System.out.println(obj3);
	}

}
