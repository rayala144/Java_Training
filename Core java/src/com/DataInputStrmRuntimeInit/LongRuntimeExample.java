package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class LongRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 numbers:");
		long a, b, x, c;
		a=Long.parseLong(dis.readLine());
		b=Long.parseLong(dis.readLine());
		x = Long.parseLong(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
