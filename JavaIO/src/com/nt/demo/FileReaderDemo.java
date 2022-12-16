package com.nt.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Assertion44.txt");
		FileReader fReader = new FileReader(file.getAbsolutePath());
		int i = fReader.read();
		while (i >= 0) {
			System.out.print((char) i);
			i = fReader.read();
		}
		fReader.close();
		
	}

}
