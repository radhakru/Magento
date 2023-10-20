package com.magento.StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.magento.Webobject.VerifyLoginUserCanPurchaseOrderObject;
import com.magento.Webobject.VerifyYouCanChangeOrReorderPreviousOrderObject;

import io.cucumber.datatable.DataTable;
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
	
	/*
	 * @Then("change the quantity of product and click on update {string}") public
	 * void change_the_quantity_of_product_and_click_on_update(String string) {
	 * vyccorpo.changeOnEditQuantity(string); vyccorpo.clcikOnUpdateButton(); }
	 */
	@Then("change the quantity of product and click on update")
	public void change_the_quantity_of_product_and_click_on_update(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete action
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
		List<Map<String,String>>tableData=dataTable.asMaps(String.class,String.class);
	
		String value=tableData.get(0).get("quantity");
		System.out.println("TestData="+value);
		vyccorpo.changeOnEditQuantity(value);
		vyccorpo.clickOnUpdateButton();
		
		
		
	    

	}

	
	@Then("click on Billing Information continue button")
	public void click_on_billing_information_continue_button() {
		vyccorpo.clickoncontinueBillingButton(driver);
	}

}
