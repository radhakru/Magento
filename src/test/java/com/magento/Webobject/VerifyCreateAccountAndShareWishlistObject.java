package com.magento.Webobject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class VerifyCreateAccountAndShareWishlistObject {
	private WebDriver ldriver;

	public VerifyCreateAccountAndShareWishlistObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public WebDriver getDriver() {
		return ldriver;
	}

	private By Account = By.xpath("//span[@class='label' and contains(text(),'Account')]");
	private By login = By.xpath("//div[@class='links']/ul/li/a");

	private By createAccount = By.xpath("//a[@class='button']");

	private By fistName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By emailId = By.id("email_address");
	private By Password = By.id("password");
	private By confirmPassword = By.id("confirmation");

	private By resistorButton = By.xpath("//button[@type='submit' and @title='Register']");
	private By resmessage = By.xpath("//li[@class='success-msg']/ul/li/span");

	private By Tvmenu = By.xpath("//a[contains(text(),'TV')]");
	private By addTowishlist = By.xpath("(//li/a[contains(text(),'Add to Wishlist')])[1]");
	private By AddtowishlistMes = By.xpath("//li[@class='success-msg']/ul/li/span");

	private By shareWishlistButton=By.xpath("//button[@class='button btn-share']");
	private By message=By.id("message");
	private By wishListButton=By.xpath("//button[@title='Share Wishlist' and @Type='submit']"); 
	
	public void clickonAccount() {
		ldriver.findElement(Account).click();
		List<WebElement> links = ldriver.findElements(login);
		for (WebElement link : links) {
			if (link.getText().equalsIgnoreCase("Log in")) {
				link.click();
				break;
			}
		}
	}

	public void clickOnCreateAccount() {
		ldriver.findElement(createAccount).click();
	}

	public void enter_Fistname(String name) {
		ldriver.findElement(fistName).sendKeys(name);
	}

	public void enter_Lastname(String name) {
		ldriver.findElement(lastName).sendKeys(name);
	}

	public void enter_EmailId(String emailid) {
		ldriver.findElement(emailId).sendKeys(emailid);
	}

	public void enter_Password(String password) {
		ldriver.findElement(Password).sendKeys(password);
	}

	public void enter_ConfirmPassword(String compassword) {
		ldriver.findElement(confirmPassword).sendKeys(compassword);
	}

	public void clickOnResistorButton() {
		ldriver.findElement(resistorButton).click();
	}

	public void verifythesuccessfulmes(String mes) {
		String actualMes = ldriver.findElement(resmessage).getText();
		System.out.println(actualMes);
		Assert.assertEquals(mes, actualMes);
	}

	public void clickontvmenu() {
		ldriver.findElement(Tvmenu).click();
	}

	public void clickonaddtowishlist() {
		ldriver.findElement(addTowishlist).click();
	}

	public void verifytheaddtowishlist(String mes) {
		String ActualMes = ldriver.findElement(AddtowishlistMes).getText();
		System.out.println(ActualMes);
		Assert.assertEquals(mes, ActualMes);
	}
	
	public void clickonShareWishlistButton() {
		ldriver.findElement(shareWishlistButton).click();
	}
	public void enterShareEmaildAndMessage(String emailid ,String Message) {
		ldriver.findElement(emailId).sendKeys(emailid);
		ldriver.findElement(message).sendKeys(Message);
	}
	public void clickonFinalWishListShareButton() {
		ldriver.findElement(wishListButton).click();
	}
	public void verify_Successful_Share_Wishlist_Mesaage(String mes) {
		String Actual=ldriver.findElement(resmessage).getText();
		System.out.println("Final message= "+Actual);
		Assert.assertEquals(mes,Actual);
		ldriver.findElement(Account).click();
		List<WebElement> links = ldriver.findElements(login);
		for (WebElement link : links) {
			if (link.getText().equalsIgnoreCase("Log out")) {
				link.click();
				break;
			}
		}
		
	}

}
