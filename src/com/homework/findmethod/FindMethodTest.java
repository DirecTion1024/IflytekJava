package com.homework.findmethod;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindMethodTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSqrtNewton() {
		assertEquals(10, FindMethod.sqrtNewton(100, 0), 0);
		System.out.println("pass");
	}

}
