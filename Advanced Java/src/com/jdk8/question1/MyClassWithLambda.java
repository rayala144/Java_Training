package com.jdk8.question1;

@FunctionalInterface
interface WordCount {
	public abstract int count(String str);
}

public class MyClassWithLambda {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc = (String str) -> {
			int count = str.split(" ").length;
			return count;
		};
		System.out.println(wc.count("What the flip is going on here?"));
	}

}
