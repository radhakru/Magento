package com.magento.StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.magento.Utility.PropertiesUtility;


import io.cucumber.java.Scenario;



abstract class Base {
	
	private static WebDriver driver;
	private static PropertiesUtility pru;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedrivernew.exe");
		
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	public static PropertiesUtility getPropertiesClass() {
		pru=new PropertiesUtility();
		return pru;
	}
	
	//take Screenshot
	public static void addScreenshot(Scenario scenario){
		if(scenario.isFailed()) {

	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}
	

	
	

}
