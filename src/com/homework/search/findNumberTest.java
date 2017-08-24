package com.homework.search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class findNumberTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTest1() {
		int arr[]=new int[99];//定一个100大小的整型数组
		for(int i=1;i<=99;i++){
			  arr[i-1] = i;//赋值1-100的数
			}
	    assertEquals(100, findNumber.test1(arr));
		System.out.println("pass");
	}

}
