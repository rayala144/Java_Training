package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.*;

public class ByteRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 numbers:");
		byte a, b, x, c;
		a=Byte.parseByte(dis.readLine());
		b=Byte.parseByte(dis.readLine());
		x = Byte.parseByte(sc.nextLine());
		c=(byte)(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
