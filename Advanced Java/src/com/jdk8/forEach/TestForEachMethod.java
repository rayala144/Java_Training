package com.jdk8.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestForEachMethod {

	public static void main(String[] args) {
		
		List<String> obj = new ArrayList<String>();
		obj.add("Far cry 6");
		obj.add("GTA 6");
		obj.add("God of War Ragnarok");
		obj.add("Call of Duty Modern Warfare");
		
		Iterator<String> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(".....using forEach......");
		
		obj.stream().forEach(game -> System.out.println("Game: "+game));
		
		
	}
}
