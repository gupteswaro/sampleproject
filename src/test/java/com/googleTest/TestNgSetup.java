package com.googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSetup {
	WebDriver driver;
	@BeforeTest
	public void opengoogle()
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\h p\\Desktop\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void giveurl() {
		driver.get("https://www.google.com/");
	}
	@AfterTest
	public void teardown() {	
		
		driver.quit();
	}

}
