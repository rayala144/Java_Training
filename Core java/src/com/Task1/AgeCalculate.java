package com.Task1;

import java.util.Scanner;


import java.time.LocalDate;
import java.time.Period;

public class AgeCalculate {
	
	static void print(Object k) {
		System.out.print(k);
	}
	
	static void println(Object k) {
		System.out.println(k);
	}
	
	public static int calc_years(LocalDate dob) {
		LocalDate currDate = LocalDate.now();
		if (dob != null && currDate != null) {
			return Period.between(dob, currDate).getYears();
		}
		else return 0;
	}
	
	
	public static Object calc_days_to_bd(LocalDate dob) {
		LocalDate currDate = LocalDate.now();
		int days = (dob.getDayOfYear() - currDate.getDayOfYear());
		if (dob != null && currDate != null) {
			if(days > 0) {
				return days;
			}
			else {
				return 0;
			}	
		}
		else return "Please enter a valid date";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		print("Enter date in YYYY-MM-DD format: ");
		String birthday = sc.nextLine();
		sc.close();
		LocalDate dob = LocalDate.parse(birthday);
		println("You are "+ calc_years(dob) +" years old!");
		println("Your birthday is "+calc_days_to_bd(dob)+" days away!!");
		print(dob);
	
	}

}
