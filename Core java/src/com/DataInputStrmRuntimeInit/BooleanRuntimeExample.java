package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class BooleanRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 boolean:");
		boolean a, b, x, c;
		a=Boolean.parseBoolean(dis.readLine());
		b=Boolean.parseBoolean(dis.readLine());
		x = Boolean.parseBoolean(sc.nextLine());
		c=(a && b && x);
		System.out.println("AND Boolean of 3 booleans:\t"+c);
		sc.close();
	}

}
