package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.ca/");
	}

	@Test

	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test
	public void mailLinktest()
	{
		boolean b1 = driver.findElement(By.linkText("Gmail")) .isDisplayed();
		System.out.println(b1);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
