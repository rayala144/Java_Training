package com.nt.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("Assertion.txt");
		pw.write(100);
		pw.println(100);
		pw.print(false);
		pw.println();
		pw.append("Appended using printwriter");
		pw.close();
	}

}
