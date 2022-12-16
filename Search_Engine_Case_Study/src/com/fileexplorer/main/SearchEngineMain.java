package com.fileexplorer.main;


import java.util.List;

import org.apache.log4j.Logger;

import com.fileexplorer.drives.SearchEngineConsole;
import com.fileexplorer.exceptions.InvalidDriveChoiceException;
import com.fileexplorer.exceptions.InvalidRootFinderException;

public class SearchEngineMain {

	public static void main(String[] args) throws InvalidDriveChoiceException, InvalidRootFinderException {

		final Logger err_log = Logger.getLogger(SearchEngineMain.class);
		// date implement
		try {
			SearchEngineConsole.displayWelcomeMessage();
			List<String> list = SearchEngineConsole.findDrives();
			list.stream().forEach(System.out::println);
			SearchEngineConsole.displaySearchResult().stream().forEach(System.out::println);
			String userName = new com.sun.security.auth.module.NTSystem().getName();
			// err_log.trace("Searched by "+ userName);
			// err_log.info(userName+" searched");
			for(String result : SearchEngineConsole.displaySearchResult()) {
				err_log.info(result);
			}
			

		} catch (InvalidDriveChoiceException | InvalidRootFinderException e) {
			// TODO: handle exception
			err_log.error("Error in entered Details: ");
			e.printStackTrace();

		}

	}

}
