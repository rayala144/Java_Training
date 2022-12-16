package com.jdk8.dateTimeExample;

import java.time.LocalTime;

public class TestLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println("Current time: "+time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int nano = time.getNano();
		
		System.out.printf("%d-%d-%d-%d", h, m, s, nano);
	}

}
