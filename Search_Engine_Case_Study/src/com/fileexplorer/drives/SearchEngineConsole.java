package com.fileexplorer.drives;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.fileexplorer.search.SearchManagerFactory;
import com.fileexplorer.searchhistory.SearchHistoryManager;

public class SearchEngineConsole {

	// display a welcome message

	public static void displayWelcomeMessage() {
		System.out.println("Welcome to the search engine...");
	}

	static Properties prop = new Properties();

	// Identify the drives
	public static List<String> findDrives() {
		try {
			prop.load(new FileInputStream(
					"C:\\Users\\rayala.akhil\\eclipse-workspace\\Search_Engine_Case_Study\\src\\Data.properties"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		List<String> drives = null;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Choice: ALL or ACTIVE");
		String choice = prop.getProperty("choice");
		drives = DriveFinderFactory.create(choice).findDrives();
		return drives;

	}

	// Display the Drives

	// Display Search Result
	public static List<String> displaySearchResult() {

		List<String> drives = new ArrayList<>();
		Scanner sc1 = new Scanner(System.in);
		// System.out.println("Enter file name");
		String fileName = prop.getProperty("filename");
		// System.out.println("Mention the number of drives to search from");
		int num = Integer.parseInt(prop.getProperty("numDrives"));
		// System.out.println("Mention the name of drives to search from");
		for (int i = 0; i < num; i++) {
			String s = prop.getProperty("drive");
			drives.add(s.concat(":\\"));
		}
//		List<String> result_paths = new ArrayList<>();
//		result_paths.add(0, "searched for " + fileName);
//		for(String path : searchForFile(fileName, drives)) {
//			result_paths.add(path);
//		}
		return searchForFile(fileName, drives);
	}

	// search for a file
	// implement multi threading

	public static List<String> searchForFile(String fileName, List<String> drives) {

		final Logger logger = Logger.getLogger(SearchEngineConsole.class);

		List<String> listOfDirectory = new ArrayList<>();
		List<String> searchFromLog = searchLogCheck(fileName);

		if (searchFromLog.size() == 0) {
			listOfDirectory = SearchManagerFactory.create().search(fileName, drives);
			SearchHistoryManager sh = new SearchHistoryManager();
			sh.logSearchResult(listOfDirectory);
			return listOfDirectory;
		} else {
			return searchFromLog;
		}

	}

	public static List<String> searchLogCheck(String fileName) {
		SearchHistoryManager sh = new SearchHistoryManager();
		List<String> logs = sh.logCheck(fileName);
		return logs;
	}

}
