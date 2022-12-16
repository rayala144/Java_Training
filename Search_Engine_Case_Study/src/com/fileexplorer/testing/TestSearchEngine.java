package com.fileexplorer.testing;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import com.fileexplorer.drives.SystemDriverFinder;
import com.fileexplorer.exceptions.InvalidRootFinderException;

import com.fileexplorer.search.ISearchManager;
import com.fileexplorer.search.SearchManagerFactory;

public class TestSearchEngine {

//	Testing search() method from SearchManager class

	@Before
	public void beforeAll() {
		System.out.println("Sarting tests...");
	}

	@Test
	public void test() {
		SystemDriverFinder test = new SystemDriverFinder();
		try {
			List<String> drives;
			drives = test.findDrives();
			String file = "installAgent.log";
			ISearchManager searchManger1 = SearchManagerFactory.create();
			List<String> actual = searchManger1.search(file, drives);
			String expect = "C:\\installAgent.log";
			assertEquals(expect, actual.get(0));
		} catch (InvalidRootFinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void afterAll() {
		System.out.println("Tests completed! ");
	}

}
