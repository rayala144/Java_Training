package com.fileexplorer.search;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher implements Runnable {

	private String fileName;
	private String drive;
	List<String> pathFound = new ArrayList<>();
	int i = 1;

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

	public void search(String fileName, String drive) {
		// File Search takes place
		File drives = new File(drive);
		File[] listOfFiles = drives.listFiles();

		if (listOfFiles != null) {
			for (File file : listOfFiles) {
				if (file.isDirectory()) {
					String content = file.toString();
					search(fileName, content);
				} else {
					if (file.getName().equalsIgnoreCase(fileName)) {
						try {
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl", "root",
									"root");
							PreparedStatement ps = con.prepareStatement("insert into searchHistory values(?,?,?)");
							String username = new com.sun.security.auth.module.NTSystem().getName();
							ps.setString(1, fileName);
							ps.setString(2, file.getAbsolutePath());
							ps.setString(3, username);
							ps.executeUpdate();
							System.out.println("Inserted records");
						} catch (Exception e) {
							System.out.print(e);
						}
						pathFound.add(file.getAbsolutePath());
					}
				}
			}
		}
	}

	@Override
	public void run() {
		search(this.getFileName(), this.getDrive());
	}

}
