package com.mageno.TestngCase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNg {
	private WebDriver driver;
	@Test
	public void test() {
		System.out.println("Hi i am new tester.");
		System.out.println("@Test method is running....");
		driver.get("https://www.google.com/");
	}
	@AfterTest
	public void Teardown() {
		System.out.println("@AfterTest  method is executed....");
		driver.close();

	}

	@BeforeTest
	public void setUp() {
		System.out.println("@BeforeTest method  is executed....");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("@BeforeClass method is executed....");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass method is executed....");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod method is executed....");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod method is executed....");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuit method is executed.....");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite method is executed.....");
	}
	
	/*
	 * @AfterGroups public void afterGroup() {
	 * System.out.println("@AfterGroup method is executed....."); }
	 * 
	 * @BeforeGroups public void eforeGroup() {
	 * System.out.println("@BeforeGroup method is executed...."); }
	 */
	
	
	@Test(priority=1)
	public void testPriority() {
		System.out.println("This method has priority one Facebook web....");
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=0)
	public void testPriority_1() {
		System.out.println("This method has priority zero open ToolsQA Web....");
		driver.get("https://toolsqa.com/");
	}
	@Test(priority=-1)
	public void testPriority_2() {
		System.out.println("This method has priority negative one open WhatsApp web.....");
		driver.get("https://web.whatsapp.com/");
	}
	
	
	
	
	

}
