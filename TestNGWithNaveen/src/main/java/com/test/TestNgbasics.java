package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgbasics {

	/*
	 * setup system property for chrome
       launch chrome browser
       Login to app
       enter URL
       google Title Test
       LogOut from app
       close browser
       Delete all cookies
       PASSED: googleTitleTest
	 */
	
//pre-conditions annotation -- starting with @Before
	@BeforeSuite  //1
	public void setUp() {
		System.out.println("setup system property for chrome");
	}

	@BeforeTest //2
	public void launchBrowser() {
        System.out.println("launch chrome browser");
	}
	@BeforeClass  //3
	public void Login() {
		System.out.println("Login to app");
	}

	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("enter URL");
	}

//test cases---- starting with @Tst
	@Test  //5
	public void googleTitleTest() {
		System.out.println("google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}

//post-conditions annotation -- starting with @After
	@AfterMethod  //6
	public void logOut() {
		System.out.println("LogOut from app");
	}
	@AfterClass  //7
	public void closeBrowser() {
		System.out.println("close browser");
	}

	@AfterTest  //8
	public void deleteAllCookies() {
        System.out.println("Delete all cookies");
	}

	@AfterSuite  //9
	public void generateTestReport() {
		System.out.println("Mona");
           
	}

}
