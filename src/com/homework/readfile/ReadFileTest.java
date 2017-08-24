package com.homework.readfile;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReadFileTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReadFile() {
		ReadFile readfile = new ReadFile();
		readfile.readFile("F:/test.txt","F:/test123.txt");
		System.out.println("done");
	}

}
