package com.Task1;

import java.util.Scanner;

public class GST_VAT_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - Restaurant\n2 - Departmental Store\n3 - Local Shops\nSelect your option: ");
		int opt = sc.nextInt();
		System.out.print("Enter amount: ");
		float amount = sc.nextFloat();

		float rest = (amount*102/100); // 2% added
		float store = (amount*103/100); // 3% added
		float shops = (amount*104/100); // 4% added

		if (opt == 1) {
			System.out.print("Total amount with GST: ");
			System.out.println(rest);
		}
		else if (opt == 2) {
			System.out.print("Total amount with GST: ");
			System.out.println(store);
		}
		else if (opt == 3) {
			System.out.print("Total amount with GST: ");
			System.out.println(shops);
		}
		sc.close();
		
	}

}
