package com.jdk8.forEach;

import java.util.HashMap;
import java.util.Map;

public class TestMapForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dict = new HashMap<String, String>();
		dict.put("Color", "Green");
		dict.put("Cinema", "Director");
		dict.put("Cricket", "Sachin");
		dict.put("Cheater", "Krishna murthy");
		dict.put("fruits", "Water melon");
		
		dict.forEach((k, v) -> System.out.println("Key: "+k+"\t Value: "+v));
		
		
	}

}
