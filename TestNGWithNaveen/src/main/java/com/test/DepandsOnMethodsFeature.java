package com.test;

import org.testng.annotations.Test;

public class DepandsOnMethodsFeature 
{

	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest()
	{
		System.out.println("Home page Test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest()
	{
		System.out.println("Search page Test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void regPageTest()
	{
		System.out.println("Registration page Test");
	}
}
