package com.mageno.TestngCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
}
