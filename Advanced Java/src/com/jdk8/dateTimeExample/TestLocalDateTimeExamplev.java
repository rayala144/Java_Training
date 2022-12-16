package com.jdk8.dateTimeExample;

import java.time.LocalDateTime;

public class TestLocalDateTimeExamplev {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();

		// System.out.println(dateTime);

		int date, month, year, hour, minute, second, nano;
		date = dateTime.getDayOfMonth();
		month = dateTime.getMonthValue();
		year = dateTime.getYear();
		hour = dateTime.getHour();
		minute = dateTime.getMinute();
		second = dateTime.getSecond();
		nano = dateTime.getNano();

		System.out.printf("Date = %d, Month = %d, Year = %d\n", date, month, year);
		System.out.println("----------------");
		System.out.printf("%d-%d-%d-%d", hour, minute, second, nano);

	}
}
