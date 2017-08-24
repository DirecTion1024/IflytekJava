package com.homework.insertsort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertSortTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("static-access")
	@Test
	public void testInsertSort() {
		InsertSort insertSort = new InsertSort();
		int expected[] = {2,3,4,5,15,19,26,27,36,38,44,46,47,48,50};
		int actuals[] = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		insertSort.insertSort(actuals);
		assertArrayEquals(expected,actuals);
		System.out.println("pass");
	}

}
