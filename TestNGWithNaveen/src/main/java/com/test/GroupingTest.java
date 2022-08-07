package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.ca/");
	}

	@Test(priority=2,groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=1,groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3,groups="Link")
	public void mailLinktest()
	{
		boolean b1 = driver.findElement(By.linkText("Gmail")) .isDisplayed();
		System.out.println(b1);
	}
	
	@Test(priority=5,groups="Test")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=4,groups="Test")
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println("Test3");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
