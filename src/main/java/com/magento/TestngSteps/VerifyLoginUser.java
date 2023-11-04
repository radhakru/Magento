package com.magento.TestngSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mageno.TestngCase.Base;
import com.magento.TestngUtility.ReadExcelFile;
import com.magento.TestngUtility.TestngUtility;
import com.magento.TestngWebObject.VerifyLoginUserCanPurchaseOrder;

public class VerifyLoginUser extends Base{
	
	private WebDriver driver;
	private VerifyLoginUserCanPurchaseOrder vlucpo;
	private TestngUtility utility;
	
	
	
	
	
	
	@BeforeTest
	public void setUp() {
		driver=getDriver();
		vlucpo=new VerifyLoginUserCanPurchaseOrder(driver);
		utility=getTestngUtilityClass();
		driver.get(utility.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	//verify login user by @dataProvider 
	@Test(dataProvider="LoginData", dataProviderClass=ReadExcelFile.class)
	public void loginTest(String name,String password) {
		driver.findElement(By.xpath("//*[text()='Account' and @class='label']")).click();
		List<WebElement> button=driver.findElements(By.xpath("//div[@class='links']/ul/li/a"));
		for(WebElement link:button) {
			if(link.getText().equalsIgnoreCase("LOg in")) {
				link.click();
				break;
			}
		}
		
		
		vlucpo.enter_EmailId(name.trim());
		vlucpo.enter_Password(password.trim());
		vlucpo.clickOnLoginButton();
		
		//duplicate line
		driver.findElement(By.xpath("//*[text()='Account' and @class='label']")).click();
		List<WebElement> logoutButton=driver.findElements(By.xpath("//div[@class='links']/ul/li/a"));
		for(WebElement link:logoutButton) {
			//Log Out
			if(link.getText().equalsIgnoreCase("LOg out")) {
				link.click();
				break;
			}
		}
		
	}
	@AfterTest
	public void Teardown() {
		driver.close();
	}

}
