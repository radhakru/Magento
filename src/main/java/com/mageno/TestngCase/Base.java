package com.mageno.TestngCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.magento.TestngUtility.TestngUtility;

public abstract class Base {

	private WebDriver driver;
	private TestngUtility tu;
	
	protected WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	protected TestngUtility getTestngUtilityClass() {
		tu=new TestngUtility();
		return tu;
	}
	
}
