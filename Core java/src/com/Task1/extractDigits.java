package com.Task1;

import java.util.Scanner;

public class extractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 4 digit number: ");
		int num = scanner.nextInt();
		System.out.println("Digits: ");
		int thousands = (num/1000)*1000;
		int hundreds = ((num-thousands)/100)*100;
		int tens = ((num-thousands-hundreds)/10)*10;
		int ones = (num-thousands-hundreds-tens);
		System.out.println(thousands);
		System.out.println(hundreds);
		System.out.println(tens);
		System.out.println(ones);
		scanner.close();
		

	}

}
