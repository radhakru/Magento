package com.magento.Webobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.junit.*;

public class CartverifyObject {
	private WebDriver ldriver;
	
	
	public CartverifyObject(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return this.ldriver;
	}
	
	
	private By addToCart=By.xpath("//button[@title='Add to Cart']");
	private By addCartMessage=By.xpath("//ul[@class='messages']/li/ul/li/span");
	
	
	//private By quantity=By.xpath("//input[@name='cart[212573][qty]']");
	
	private By quantity=By.xpath("//td[@class='product-cart-actions']/input");
	
	private By update=By.xpath("//*[@class='product-cart-actions']/button");
	private By emptycart=By.xpath("//*[contains(text(),'Empty Cart')]");
	private By emptycartText=By.xpath("//div[@class='page-title']/h1");


	public By getAddToCart() {
		return addToCart;
	}

	public By getAddCartMessage() {
		return addCartMessage;
	}

	public By getQuantity() {
		return quantity;
	}

	public By getUpdate() {
		return update;
	}

	public By getEmptycart() {
		return emptycart;
	}

	public By getEmptycartText() {
		return emptycartText;
	}
	
	
	public void click_On_Add_To_Cart() {
		ldriver.findElement(addToCart).click();
	}
	
	
	public void verify_Success_Message(String expectedMes) {
		String actual=ldriver.findElement(addCartMessage).getText();
		System.out.println("Actual="+actual);
		System.out.println("Expected="+expectedMes);
		Assert.assertEquals(expectedMes, actual);
	}
	
	
	public void edit_The_Quantity_Of_Product(int num) {
		String number=String.valueOf(num);
		System.out.println("input Quantity="+number);
		ldriver.findElement(quantity).click();
		ldriver.findElement(quantity).sendKeys(number);
	}
	
	public void update_The_Quantity() {
		ldriver.findElement(update).click();
	}
	
	public void verify_Error_Message(String expectedMes) {
		String actual=ldriver.findElement(addCartMessage).getText();
		System.out.println("Actual mes="+actual);
		System.out.println("Excepted mes="+expectedMes);
		Assert.assertEquals(expectedMes,actual);
	}
	public void click_On_EmptyCart_Link() {
		ldriver.findElement(emptycart).click();
		
	}
	public void verify_The_Emptycart_Page_Message(String expectedMes) {
		String actual=ldriver.findElement(emptycartText).getText().toLowerCase();
		
		System.out.println("Actual="+actual);
		System.out.println("expected="+expectedMes);
		Assert.assertEquals(expectedMes.toLowerCase(), actual);
	}
	

}
