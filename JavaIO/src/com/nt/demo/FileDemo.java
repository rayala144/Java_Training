package com.nt.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("Assertion44.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.getPath());
	}

}
