package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class ShortRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 numbers:");
		short a, b, x, c;
		a=Short.parseShort(dis.readLine());
		b=Short.parseShort(dis.readLine());
		x = Short.parseShort(sc.nextLine());
		c=(short)(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
