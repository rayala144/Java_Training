package com.jdk8.dateTimeExample;

import java.time.LocalDate;

public class TestLocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.print("Real Date format is ");
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		
	}

}
