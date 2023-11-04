package com.magento.TestngSteps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mageno.TestngCase.Base;
import com.magento.TestngUtility.TestngUtility;
import com.magento.TestngWebObject.MobileItemVerifyObject;
public class MobileItemVerify extends Base{
	
	private WebDriver driver;
	private TestngUtility utility;
	private MobileItemVerifyObject mo;
	
	@BeforeTest
	public void setUp() throws FileNotFoundException, IOException {
		driver=getDriver();
		mo=new MobileItemVerifyObject(driver);
		utility=getTestngUtilityClass();
		driver.get(utility.getUrl());
		driver.manage().window().maximize();
		
	}
	@Test(priority=0)
	public void verifyHomepageTitle() {
		System.out.println("Page title="+driver.getTitle());
		System.out.println(utility.getHomepageTitle());
		mo.verify_The_Main_Page_Title(utility.getHomepageTitle());
	}
	
	@Test(priority=1)
	public void clickonMobileMenu() {
		mo.clickOnMobileMenu();
	}
	@Test(priority=2)
	public void verifyMobilePageTitle() {
		mo.verify_The_Mobile_Page_Title(utility.getMobilePageTitle());
	}
	@Test(priority=3)
	public void selectMobileByName() {
		mo.select_Item_By_SORT_Dropdown_As_Name(utility.getSelect());
	}
	
	@Test(priority=4)
	public void verifyProductName() {
		mo.sortItemverify();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
