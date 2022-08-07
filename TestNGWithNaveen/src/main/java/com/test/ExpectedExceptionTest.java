package com.test;

import org.testng.annotations.Test;

public class ExpectedExceptionTest
{
//how to handle exception without try and catch block
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1()
	{
		String x ="100A";
		Integer.parseInt(x);
	}
}
