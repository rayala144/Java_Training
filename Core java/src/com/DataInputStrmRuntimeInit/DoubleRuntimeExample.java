package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class DoubleRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 doubles:");
		double a, b, x, c;
		a=Double.parseDouble(dis.readLine());
		b=Double.parseDouble(dis.readLine());
		x = Double.parseDouble(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 doubles:\t"+c);
		sc.close();
	}

}
