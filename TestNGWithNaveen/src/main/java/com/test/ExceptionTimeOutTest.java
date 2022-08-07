package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest
{

	@Test(timeOut = 1000)
	public void infiniteLoopTest()
	{
		int i =1;
		while(i==1)
		{
			System.out.println(i); // 1 1 1 1 1 1 1  1 1 1 1 1 1............ will print till 1 sec. over
			i++;
		}
	}
}
