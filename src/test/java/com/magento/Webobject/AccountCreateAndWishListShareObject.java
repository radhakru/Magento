package com.magento.Webobject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;

public class AccountCreateAndWishListShareObject {
	//local driver
	private WebDriver ldriver;

	public AccountCreateAndWishListShareObject(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
	}
	
	public WebDriver getDriver() {
		return ldriver;
	}
	
	private By accountButton=By.xpath("//*[text()='Account' and @class='label']");
	private By loginButton=By.xpath("//div[@class='links']/ul/li/a");
	private By createAnAccount=By.xpath("//a[@class='button']");
	private By userFirstName=By.id("firstname");
	private By userLastName=By.id("lastname");
	private By emailAddress=By.id("email_address");
	private By password=By.id("password");
	private By confirmPassword=By.id("confirmation");
	private By resistor=By.xpath("//button[@class='button' and @type='submit' and @title='Register']");
	private By successfulRegistorMes=By.xpath("//li[@class='success-msg']/ul/li/span");
	private By tvMenu=By.xpath("//a[contains(text(),'TV')]");
	private By LGLCD=By.xpath("(//li/a[contains(text(),'Add to Wishlist')])[1]");
	private By successfulWishlistMes=By.xpath("//li[@class='success-msg']/ul/li/child::span");
	private By shareWishList=By.xpath("//button[@class='button btn-share']");
	private By emailAddressForShareWishList=By.id("email_address");
	private By messageForShareWishList=By.id("message");
	private By shareWishlistButton=By.xpath("//button[@type='submit' and @class='button' and @title='Share Wishlist']");
			//By.className("button");

	public By getAccountButton() {
		return accountButton;
	}

	public By getLoginButton() {
		return loginButton;
	}

	public By getCreateAnAccount() {
		return createAnAccount;
	}

	public By getUserFirstName() {
		return userFirstName;
	}

	public By getUserLastName() {
		return userLastName;
	}

	public By getEmailAddress() {
		return emailAddress;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getResistor() {
		return resistor;
	}

	public By getSuccessfulRegistorMes() {
		return successfulRegistorMes;
	}

	public By getTvMenu() {
		return tvMenu;
	}

	public By getLGLCD() {
		return LGLCD;
	}

	public By getShareWishList() {
		return shareWishList;
	}

	public By getEmailAddressForShareWishList() {
		return emailAddressForShareWishList;
	}

	public By getMessageForShareWishList() {
		return messageForShareWishList;
	}

	public By getShareWishlistButton() {
		return shareWishlistButton;
	}
	
	
	
	public void click_On_Account() {
		ldriver.findElement(accountButton).click();
		List<WebElement> linkes=ldriver.findElements(loginButton);
		for(WebElement link:linkes) {
			if(link.getText().equalsIgnoreCase("LOg in")) {
				link.click();
				break;
			}
		}
	}
	
	public void click_On_Create_An_Account() {
		ldriver.findElement(createAnAccount).click();
	}
	public void Enter_userFirstName( String firstName ) {
		ldriver.findElement(userFirstName).sendKeys(firstName);
	}
	public void Enter_userLastName(String lastName) {
		ldriver.findElement(userLastName).sendKeys(lastName);
	}
	public void Enter_EmailId(String emialId) {
		ldriver.findElement(emailAddress).sendKeys(emialId);
	}
	public void Enter_Password(String Password) {
		ldriver.findElement(password).sendKeys(Password);
	}
	public void Enter_confirmPassword(String password) {
		ldriver.findElement(confirmPassword).sendKeys(password);
		
	}
	public void click_On_Register_Button() {
		ldriver.findElement(resistor).click();
	}
	public void verify_Successful_Mes_For_Resistation(String mes) {
		String resistationMes=ldriver.findElement(successfulRegistorMes).getText();
		System.out.println("Successful Registation mes= "+resistationMes);
		Assert.assertEquals(mes, resistationMes);
	}
	public void click_On_Tv_menu() {
		ldriver.findElement(tvMenu).click();
	}
	public void Add_LG_Tv_To_Wishlist() {
		ldriver.findElement(LGLCD).click();
	}
	public void verify_Sucessful_Add_Message(String mes) {
		String wishlistmes=ldriver.findElement(successfulWishlistMes).getText();
		System.out.println("Wishlist added to account message= "+wishlistmes);
		Assert.assertEquals(mes,wishlistmes);
	}
	public void click_On_Share_Wishlist_Button() {
		ldriver.findElement(shareWishList).click();
	}
	public void Enter_EmailId_For_Share_Wishlist(String EmailID) {
		ldriver.findElement(emailAddressForShareWishList).sendKeys(EmailID);
	}
	public void Enter_Message(String message) {
		ldriver.findElement(messageForShareWishList).sendKeys(message);
	}
	public void click_On_Final_Share_wishList_button() {
		ldriver.findElement(shareWishlistButton).click();
	}
	public void verify_The_Successful_Message_For_Share_Wishlist(String mes) {
		String shareWishlistmes=ldriver.findElement(successfulRegistorMes).getText();
		System.out.println("Share WishList ="+shareWishlistmes);
		Assert.assertEquals(mes, shareWishlistmes);
		ldriver.findElement(accountButton).click();
		List<WebElement> linkes=ldriver.findElements(loginButton);
		for(WebElement link:linkes) {
			if(link.getText().equalsIgnoreCase("LOg out")) {
				link.click();
				break;
			}
		}
	}
	
	
}
