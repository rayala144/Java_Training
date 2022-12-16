package com.fileexplorer.search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher implements Runnable {

//public class FileSearcher extends Thread {

	private String fileName;
	private String drive;
	List<String> pathFound =new ArrayList<>();

	public String getFileName() {
		return fileName;
	}

	public String getDrive() {
		return drive;
	}

	public List<String> getPathFound() {
		return pathFound;
	}

	public FileSearcher(String fileName, String drive) {
		super();
		this.fileName = fileName;
		this.drive = drive;
		
	}

	public String search(String fileName, String drive) {
		// File Search takes place
		String file_found = null;
		File drives= new File(drive);
		File[] listOfFiles =drives.listFiles();
		if(listOfFiles !=null) {
			for(File file : listOfFiles) {
				if(file.isDirectory()) {
					String content =file.toString();
					search(fileName, content); // recursive search
				}
				else {
					if(file.getName().equalsIgnoreCase(fileName)) {
						System.out.println(file.getAbsolutePath());
						pathFound.add(file.getAbsolutePath());
						file_found = file.getAbsolutePath();
					}
				}
			}
		}
		return file_found;
	}

	@Override
	public void run() {
		search(this.getFileName(), this.getDrive());

	}

}
