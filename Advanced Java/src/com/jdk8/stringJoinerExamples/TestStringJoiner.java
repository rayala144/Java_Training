package com.jdk8.stringJoinerExamples;

import java.util.StringJoiner;

public class TestStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner obj = new StringJoiner(" @ ");
		obj.add("Kawasaki");
		obj.add("Suzuki");
		obj.add("Yamaha");
		obj.add("KTM Duke");
		System.out.println(obj);
		
		// String string = "Akhil, Mohan, Krishna, Indra, Ganti";
		// String[] names = string.split(",");
		
		
	}

}
