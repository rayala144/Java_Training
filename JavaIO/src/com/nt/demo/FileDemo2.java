package com.nt.demo;

import java.io.File;
import java.io.IOException;

// Write a code to create a directory named with Akhil123 and create new file called abcd.txt in that directory

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Akhil123");
		file.mkdir();
		File file2 = new File("Akhil123", "abcd.txt");
		file2.createNewFile();
	}

}
