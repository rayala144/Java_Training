package com.Task1;

import java.util.Scanner;

@SuppressWarnings("unused")

public class claculateTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of units:");
		int num = scanner.nextInt();
		
		double tax;
		if (num <= 50) {
			tax = num*(0.153);
		}
		
		else if(num > 50 && num <= 100){
			tax = (50*0.153) + (num-50)*(0.439);
		}
		
		else {
			tax = (50*0.153) + (50*0.439) + (num-100)*(0.838);
		}
		
		scanner.close();
		
		
	}

}
