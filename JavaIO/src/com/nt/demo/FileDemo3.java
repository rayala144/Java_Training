package com.nt.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\rayala.akhil\\Downloads\\Akhil");
		file.mkdir();
		File file2 = new File("C:\\Users\\rayala.akhil\\Downloads\\Akhil", "Sample2.txt");
		file2.createNewFile();
		System.out.println("File created");
	}

}
