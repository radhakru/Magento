package com.magento.StepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Utility.PropertiesUtility;
import com.magento.Webobject.CartverifyObject;

import io.cucumber.java.en.*;

public class CartVerify extends Base{
	
	private WebDriver driver;
	private CartverifyObject cvo;
	private JavascriptExecutor js;
	private PropertiesUtility pu;
	
	
	@Then("Add to card")
	public void add_to_card() {
		driver=getDriver();
		cvo=new CartverifyObject(driver);
		js=(JavascriptExecutor) driver;
		pu=getPropertiesClass();
		cvo.click_On_Add_To_Cart();
		js.executeScript("window.scrollBy(0,100)","");
		
		
	    
	}

	@Then("Verify product should be added in card page")
	public void verify_product_should_be_added_in_card_page() throws InterruptedException {
		Thread.sleep(3000);
		//cvo.verify_Success_Message("Sony Xperia was added to your shopping cart.");
		
		
		//new Code
		cvo.verify_Success_Message(pu.getProductSuccessfullyAdded());
		
	}    	

	@Then("Update the product quantity to {int}")
	public void update_the_product_quantity_to(Integer int1) {
		int value=int1.intValue();
		cvo.edit_The_Quantity_Of_Product(value);
		cvo.update_The_Quantity();
	    
	}

	@Then("verify the error message")
	public void verify_the_error_message() {
	   // cvo.verify_Error_Message("Some of the products cannot be ordered in requested quantity.");
	    
		
		//new Code
		cvo.verify_Error_Message(pu.getProductQunatity());
		
		js.executeScript("window.scrollBy(0,200)", "");
	}

	@Then("click on Empty card link in the footer of the all mobiles")
	public void click_on_empty_card_link_in_the_footer_of_the_all_mobiles() {
	    cvo.click_On_EmptyCart_Link();
	}

	@Then("verify card is empty")
	public void verify_card_is_empty() {
	   // cvo.verify_The_Emptycart_Page_Message("Shopping Cart is Empty");
		
		//new Code
		cvo.verify_The_Emptycart_Page_Message(pu.getCartMes());
	}
	
	

}
