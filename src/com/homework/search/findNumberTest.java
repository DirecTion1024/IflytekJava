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
		int arr[]=new int[99];//��һ��100��С����������
		for(int i=1;i<=99;i++){
			  arr[i-1] = i;//��ֵ1-100����
			}
	    assertEquals(100, findNumber.test1(arr));
		System.out.println("pass");
	}

}
