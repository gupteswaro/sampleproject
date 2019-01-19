package com.googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Google {
	WebDriver driver;
	public void m1() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\h p\\Desktop\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	public static void main(String[] args) {
		
		Launch_Google obj =new Launch_Google();
		obj.m1();
	}

}
