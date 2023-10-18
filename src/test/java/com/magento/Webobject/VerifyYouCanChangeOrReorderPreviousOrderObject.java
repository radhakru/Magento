package com.magento.Webobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyYouCanChangeOrReorderPreviousOrderObject {

	
	private WebDriver ldriver;
	private VerifyLoginUserCanPurchaseOrderObject ob;
	
	public VerifyYouCanChangeOrReorderPreviousOrderObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	public WebDriver getDriver() {
		return ldriver;
	}
	
	public By getReOrder() {
		return reOrder;
	}

	public By getEditQuantity() {
		return editQuantity;
	}

	public By getUpdateButton() {
		return updateButton;
	}

	private By reOrder=By.xpath("//tr[@class='first odd']/td[6]/span/a[2]");
	private By editQuantity=By.xpath("//td[@class='product-cart-actions']/input");
	private By updateButton=By.xpath("//td[@class='product-cart-actions']/button");
	
	
	
	public void clickOnReOrderLink() {
		ldriver.findElement(reOrder).click();
	}
	public void changeOnEditQuantity(String Quantity) {
		ldriver.findElement(editQuantity).clear();
		ldriver.findElement(editQuantity).sendKeys(Quantity);
	}
	public void clcikOnUpdateButton() {
		ldriver.findElement(updateButton).click();
	}
	public void clickoncontinueBillingButton(WebDriver driver) {
		ob=new VerifyLoginUserCanPurchaseOrderObject(driver);
		ldriver.findElement(ob.getBillingCountinueButton()).click();
	}
		
	
}
