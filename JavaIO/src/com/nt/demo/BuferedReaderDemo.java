package com.nt.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("abc.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		String line = bReader.readLine();
		while (line != null) {
			System.out.println(line);
			line = bReader.readLine();
		}
		bReader.close();
	}

}
