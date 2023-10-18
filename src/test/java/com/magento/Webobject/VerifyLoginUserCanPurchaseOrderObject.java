package com.magento.Webobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class VerifyLoginUserCanPurchaseOrderObject {
	private WebDriver ldriver;
	private Select select;
	private Robot robot;
	
	
	public VerifyLoginUserCanPurchaseOrderObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	public WebDriver getDriver() {
		return ldriver;
	}
	
	
	
	
	
	private By login_EmailId=By.id("email");
	private By login_Password=By.id("pass");
	private By loginbutton=By.id("send2");
	private By Account=By.xpath("//span[@class='label' and contains(text(),'Account')]");
	private By Listitem=By.xpath("//div[@class='links']/ul/li/a");
	private By addToCart=By.xpath("//button[@title='Add to Cart' and @type='button']");
	private By proceedToCheckout=By.xpath("(//button[@title='Proceed to Checkout' and @class='button btn-proceed-checkout btn-checkout'])[1]");
	
	//div[@class='input-box']/select[@id='country']
	private By selectForContry=By.xpath("//select[@id='country']");
	private By selectForReligion=By.xpath("//select[@id='region_id']");
	private By pincode=By.id("postcode");
	private By estimate=By.xpath("//button[@title='Estimate']");
	private By cart_price=By.xpath("(//span[@class='cart-price']/span[@class='price'])[1]");
	private By total_Price=By.xpath("//strong/span[@class='price']");
	private By FlatRate=By.id("s_method_flatrate_flatrate");
	private By updateButton=By.name("do");
	private By fixedprice=By.xpath("//label/span[@class='price']");
	private By sceondproceedTocheckbutton=By.xpath("(//button[@title='Proceed to Checkout' and @class='button btn-proceed-checkout btn-checkout'])[2]");
	private By billingAddress=By.id("billing:street1");
	private By billingCity=By.id("billing:city");
	private By billingstate=By.id("billing:region_id");
	private By billingZipcode=By.id("billing:postcode");
	private By billingregion=By.id("billing:country_id");
	private By billingPhone=By.id("billing:telephone");
	private By billingCountinueButton=By.xpath("(//button[@title='Continue' and @type='button'])[1]");
	private By shippingMethodContinue=By.xpath("(//span[contains(text(),'Continue')])[3]");
	private By paymentInformationCheckRadioButton=By.xpath("//input[@id='p_method_checkmo']");
	private By paymentInformationCountinue=By.xpath("(//span[contains(text(),'Continue')])[4]");
	private By orderReviewPlaceOrderButton=By.xpath("//button[@class='button btn-checkout']");
	private By orderId=By.xpath("//div[@class='col-main']/p/a");
	private By orderSuccessfulMes=By.xpath("//div[@class='col-main']/div/h1");
	
	
	
	public void setLdriver(WebDriver ldriver) {
		this.ldriver = ldriver;
	}

	public By getAccount() {
		return Account;
	}

	public void setAccount(By account) {
		Account = account;
	}

	public By getListitem() {
		return Listitem;
	}

	public void setListitem(By listitem) {
		Listitem = listitem;
	}

	public By getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(By addToCart) {
		this.addToCart = addToCart;
	}

	public By getEstimate() {
		return estimate;
	}

	public void setEstimate(By estimate) {
		this.estimate = estimate;
	}

	public By getCart_price() {
		return cart_price;
	}

	public void setCart_price(By cart_price) {
		this.cart_price = cart_price;
	}

	public By getFlatRate() {
		return FlatRate;
	}

	public void setFlatRate(By flatRate) {
		FlatRate = flatRate;
	}

	public By getFixedprice() {
		return fixedprice;
	}

	public void setFixedprice(By fixedprice) {
		this.fixedprice = fixedprice;
	}

	public By getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(By billingAddress) {
		this.billingAddress = billingAddress;
	}

	public By getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(By billingCity) {
		this.billingCity = billingCity;
	}

	public By getBillingstate() {
		return billingstate;
	}

	public void setBillingstate(By billingstate) {
		this.billingstate = billingstate;
	}

	public By getBillingZipcode() {
		return billingZipcode;
	}

	public void setBillingZipcode(By billingZipcode) {
		this.billingZipcode = billingZipcode;
	}

	public By getBillingregion() {
		return billingregion;
	}

	public void setBillingregion(By billingregion) {
		this.billingregion = billingregion;
	}

	public By getBillingPhone() {
		return billingPhone;
	}

	public void setBillingPhone(By billingPhone) {
		this.billingPhone = billingPhone;
	}

	public By getBillingCountinueButton() {
		return billingCountinueButton;
	}

	public void setBillingCountinueButton(By billingCountinueButton) {
		this.billingCountinueButton = billingCountinueButton;
	}

	public Select getSelect() {
		return select;
	}

	public Robot getRobot() {
		return robot;
	}

	public By getLogin_EmailId() {
		return login_EmailId;
	}

	public By getLogin_Password() {
		return login_Password;
	}

	public By getLoginbutton() {
		return loginbutton;
	}

	public By getProceedToCheckout() {
		return proceedToCheckout;
	}

	public By getSelectForContry() {
		return selectForContry;
	}

	public By getSelectForReligion() {
		return selectForReligion;
	}

	public By getPincode() {
		return pincode;
	}

	public By getTotal_Price() {
		return total_Price;
	}

	public By getUpdateButton() {
		return updateButton;
	}

	public By getSceondproceedTocheckbutton() {
		return sceondproceedTocheckbutton;
	}

	public By getShippingMethodContinue() {
		return shippingMethodContinue;
	}

	public By getPaymentInformationCheckRadioButton() {
		return paymentInformationCheckRadioButton;
	}

	public By getPaymentInformationCountinue() {
		return paymentInformationCountinue;
	}

	public By getOrderReviewPlaceOrderButton() {
		return orderReviewPlaceOrderButton;
	}

	public By getOrderId() {
		return orderId;
	}

	public By getOrderSuccessfulMes() {
		return orderSuccessfulMes;
	}
	
	
	
	
	
	
	//user login
	public void enter_EmailId(String email) {
		ldriver.findElement(login_EmailId).sendKeys(email);
	}
	public void enter_Password(String pass) {
		ldriver.findElement(login_Password).sendKeys(pass);
	}
	public void clickOnLoginButton() {
		ldriver.findElement(loginbutton).click();
	}
	
	
	//user click on wishlist button
	public void clickOnWishListButton() {
		ldriver.findElement(Account).click();
		List<WebElement> items=ldriver.findElements(Listitem);
		for(WebElement item:items) {
			if(item.getText().equalsIgnoreCase("My Wishlist (1 item)")) {
				item.click();
				break;
			}
		}
	}
	
	
	//Item added to card link
	public void clickOnAddToCard() {
		ldriver.findElement(addToCart).click();
		
	}
	
	//click Proceed to back
	public void clickOnProceedToCheckOutButton() {
		ldriver.findElement(proceedToCheckout).click();
		ldriver.navigate().back();
	}
	
	//select all the address for shipping order.
	public void selectState_And_Religion_And_Pincode_For_Shipping(String country,String religion,String Pincode) {
		select=new Select(ldriver.findElement(selectForContry));
		select.selectByVisibleText(country);
		select=new Select(ldriver.findElement(selectForReligion));
		select.selectByVisibleText(religion);
		ldriver.findElement(pincode).sendKeys(Pincode);
	}
	
	//click on Estimate
	
	public void clickOnEstimate() {
		ldriver.findElement(estimate).click();
	}
	
	//verify the price
	public void verify_Cost_For_Shopping() {
		String product_price=ldriver.findElement(cart_price).getText();
		System.out.println(product_price);
		String TotalPrice=ldriver.findElement(total_Price).getText();
		System.out.println(TotalPrice);
		Assert.assertEquals(product_price,TotalPrice);
	}
	
	//click on fixed rate radio button
	public void clickOnfixedRadioButton() {
		ldriver.findElement(FlatRate).click();
	}
	
	//click on update button
	public void clickOnUpdateButton() {
		ldriver.findElement(updateButton).click();
	}
	
	//verify the shopping cost added to cart
	public void VerifyShoppingprice() {
		String fixedPrice=ldriver.findElement(fixedprice).getText();
		System.out.println("fixed price="+fixedPrice);
		String ProductPrice=ldriver.findElement(cart_price).getText();
		System.out.println("product price="+ProductPrice);
		/*
		 * int value1=Integer.parseInt(fixedPrice); int
		 * value2=Integer.parseInt(ProductPrice); System.out.println(value1+value2);
		 */
		
		//int CartPrice=Integer.parseInt(ldriver.findElement(total_Price).getText());
		//System.out.println("Total price="+CartPrice);
		
		
		//change here
		String total=ldriver.findElement(total_Price).getText();
		System.out.println("Total prive ="+total);
		
	}
	
	
	

	//again click on proceed to checkout button
	public void clickOnSecondProceedToCheckOutButton() {
		ldriver.findElement(sceondproceedTocheckbutton).click();
	}
	
	//Enter billing Information
	public void Enter_Bill_Address(String name) {
		ldriver.findElement(billingAddress).sendKeys(name);
	}
	public void Enter_Bill_City(String name) {
		ldriver.findElement(billingCity).sendKeys(name);
	}
	
	public void Enter_Bill_State(String name) {
		select=new Select(ldriver.findElement(billingstate));
		select.selectByVisibleText(name);
	}
	public void Enter_Bill_Zipcode(String name) {
		ldriver.findElement(billingZipcode).sendKeys(name);
	}
	public void Enter_Bill_Region(String name) {
		select=new Select(ldriver.findElement(billingregion));
		select.selectByVisibleText(name);
	}
	public void Enter_Bill_PhoneNumber(String num) {
		ldriver.findElement(billingPhone).sendKeys(num);
	}
	public void clickOnContinueForBilling() {
		ldriver.findElement(billingCountinueButton).click();
	}
	
	
	//Shipping Information
	public void clickOnShipingContinueButton(){
		WebDriverWait wait=new WebDriverWait(ldriver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(shippingMethodContinue));
		ldriver.findElement(shippingMethodContinue).click();
		
	}
	
	//Payment Method
	public void selectPaymentMethodToCheck() {
		ldriver.findElement(paymentInformationCheckRadioButton).click();
		
	}
	public void clickOnPaymentMethodContinueButton() {
		ldriver.findElement(paymentInformationCountinue).click();
	}
	
	
	//order Method
	public void clickOnPlaceorderButton() {
		ldriver.findElement(orderReviewPlaceOrderButton).click();
	}
	
	
	public void verify_Order_Mes_And_Order_Id() {
		String ordermes=ldriver.findElement(orderSuccessfulMes).getText();
		System.out.println(ordermes);
		String orderid=ldriver.findElement(orderId).getText();
		System.out.println(orderid);
		
	}
	
	
	
	
	
	
	
}
