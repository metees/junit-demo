package com.learn.ci.junit.client;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void  testCase1() {
		int i = 1 ;
		int j = 2;
		assert(i+j == 3);
	}
	
}
