package com.magento.StepDefination;

import org.openqa.selenium.WebDriver;

import com.magento.Webobject.VerifyLoginUserCanPurchaseOrderObject;
import com.magento.Webobject.VerifyYouCanChangeOrReorderPreviousOrderObject;

import io.cucumber.java.en.Then;

public class VerifyYouCanChangeOrReorderPreviousOrder extends Base{
	
	private WebDriver driver;
	private VerifyYouCanChangeOrReorderPreviousOrderObject vyccorpo;
	
	
	@Then("click on REORDER link")
	public void click_on_reorder_link() {
	   driver=getDriver();
	   vyccorpo=new VerifyYouCanChangeOrReorderPreviousOrderObject(driver);
	   vyccorpo.clickOnReOrderLink();
	  
	   
	}
	
	@Then("change the quantity of product and click on update {string}")
	public void change_the_quantity_of_product_and_click_on_update(String string)
	{
		vyccorpo.changeOnEditQuantity(string);
		vyccorpo.clcikOnUpdateButton();
	}
	
	@Then("click on Billing Information continue button")
	public void click_on_billing_information_continue_button() {
		vyccorpo.clickoncontinueBillingButton(driver);
	}

}
