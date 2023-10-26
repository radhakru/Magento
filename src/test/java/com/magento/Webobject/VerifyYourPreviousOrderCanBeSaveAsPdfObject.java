package com.magento.Webobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class VerifyYourPreviousOrderCanBeSaveAsPdfObject {
	private WebDriver ldriver;
	private List<WebElement> links;
	private String actualOrderId,status;
	
	private Robot robot;
	
	public VerifyYourPreviousOrderCanBeSaveAsPdfObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	protected WebDriver getDriver() {
		return ldriver;
	}
	
	
	private By allTagsOfAccounts=By.xpath("//div[@class='block-content']/ul/li/a");
	
	//private By ActualOdrerId=By.xpath("//tr[@class='first last odd']/td[@class='number']");
	
	//modify code
	private By ActualOdrerId=By.xpath("//tr[@class='first odd']/td[@class='number']");
	
	private By orderStatus=By.xpath("//td[@class='status']/em");
	
	private By viewOrder=By.xpath("//a[contains(text(),'View Order')]");
	
	private By printOrder=By.xpath("//a[contains(text(),'Print Order')]");
	
	
	
	public void clickOnMyOrderLink() {
		links = ldriver.findElements(allTagsOfAccounts);
		for(WebElement link: links) {
			if(link.getText().equalsIgnoreCase("my orders")) {
				
				link.click();
				
				break;
			}
		}
		
	}
	public void verifyOrderIdAndStatus(String name) {
		actualOrderId = ldriver.findElement(ActualOdrerId).getText();
		status=ldriver.findElement(orderStatus).getText();
		System.out.println(actualOrderId);
		System.out.println(name);
		System.out.println(status);
		
		
	}
	public void clickOnViewOrder() {
		ldriver.findElement(viewOrder).click();
	}
	public void clickOnPrintOrder() {
		ldriver.findElement(printOrder).click();
	}
	
	//Default
	public void verifyOrderFileSaveAsPdf() throws AWTException, InterruptedException {
		int size=ldriver.getWindowHandles().size();
		System.out.println(size);
		Iterator<String> window=ldriver.getWindowHandles().iterator(); 
		String parent=ldriver.getWindowHandle();
		System.out.println(ldriver.getTitle());
		while(window.hasNext()) {
			ldriver.switchTo().window(window.next());
			System.out.println("title ="+ldriver.getTitle());
						
		}
		ldriver.close();
		ldriver.switchTo().window(parent);
			
		
		
	}
	
	
	
	
	

}
