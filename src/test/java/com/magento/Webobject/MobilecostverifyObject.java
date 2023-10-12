package com.magento.Webobject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class MobilecostverifyObject {
	private WebDriver ldriver;
	private MobileitemverifyObject mivo;
	
	private String price;
	private String actualPrice;
	
	public MobilecostverifyObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public WebDriver getDriver() {
		return this.ldriver;
	}
	
	private By priceMobiles=By.xpath("//span[@class='price']");
	private By priceSonyExperia=By.xpath("//a[text()='Sony Xperia']");
	
	
	public By getPriceSonyExperia() {
		return priceSonyExperia;
	}

	public By getPriceMobiles() {
		return this.priceMobiles;
	}
	
	
	public void click_on_mobile_menu() {
		mivo=new MobileitemverifyObject(ldriver);
		mivo.clickOnMobileMenu();
	}
	public void grapPrice_Of_Mobile() {
		List<WebElement> prices=ldriver.findElements(priceMobiles);
		System.out.println("Mobile ="+prices.size());
		price=prices.get(prices.size()-1).getText();
		System.out.println(price);
		
	}
	public void click_on_sony_xperia() {
		ldriver.findElement(priceSonyExperia).click();
	}
	public void grap_Price_Of_Sony_Xperia() {
		actualPrice=ldriver.findElement(priceMobiles).getText();
		System.out.println(actualPrice);
		
	}
	public void isEqual() {
		Assert.assertEquals(price, actualPrice);
	}
	
	
}
