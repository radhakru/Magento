package com.magento.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



abstract class Base {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedrivernew.exe");
		
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	

	
	

}
