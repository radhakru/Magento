package com.mageno.TestngCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class ParallelTest2 extends Base{
	private WebDriver driver;
	
	
	@Test
	public void chromeTest() {
		System.out.println("Open google in ChromeTest method");
		driver=getDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("chromeTest Title ="+driver.getTitle());
		System.out.println(Thread.currentThread().getId());
		
	}
	//threadPoolSize=2
	//invocationCount=2
	@Test(threadPoolSize=3,invocationCount=3,timeOut=3000)
	public void firefoxTest() {
		System.out.println("Open google in firefoxTest method");
		driver=getDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("firefoxTest title ="+driver.getTitle());
		System.out.println(Thread.currentThread().getId());
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
//running parallelTest2 class---5947ms(Methods:2)Test:1/1
}
