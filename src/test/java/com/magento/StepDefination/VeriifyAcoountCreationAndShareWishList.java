package com.magento.StepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Utility.PropertiesUtility;
import com.magento.Webobject.AccountCreateAndWishListShareObject;

import io.cucumber.java.en.*;

public class VeriifyAcoountCreationAndShareWishList extends Base{

	private WebDriver driver;
	private AccountCreateAndWishListShareObject acaws;
	private JavascriptExecutor js;
	private PropertiesUtility pu;

	@When("click on Account button")
	public void click_on_account_button() {
		driver=getDriver();
		acaws=new AccountCreateAndWishListShareObject(driver);
		js=(JavascriptExecutor)driver;
		pu=getPropertiesClass();
		acaws.click_On_Account();
	}

	@Then("click on CREATE AN ACCOUNT button")
	public void click_on_create_an_account_button() throws InterruptedException {
		Thread.sleep(2000);
		acaws.click_On_Create_An_Account();
	}

	@Then("Enter userFristname {string},userLastname {string},userEmailId {string},password {string},confirm password {string}")
	public void enter_user_fristname_user_lastname_user_email_id_password_confirm_password(String string,
			String string2, String string3, String string4, String string5) {
		acaws.Enter_userFirstName(string);
		acaws.Enter_userLastName(string2);
		acaws.Enter_EmailId(string3);
		js.executeScript("window.scrollBy(0,200)", "");
		acaws.Enter_Password(string4);
		acaws.Enter_confirmPassword(string5);
	}

	@Then("click on REGISTOR button")
	public void click_on_registor_button() throws InterruptedException {
		Thread.sleep(2000);
		acaws.click_On_Register_Button();
	}

	@Then("verify the RSGISTATION SUCCESSFUL MESSAGE.")
	public void verify_the_rsgistation_successful_message() {
		//String SuccessfulRegistor="Thank you for registering with Main Website Store.";
		//acaws.verify_Successful_Mes_For_Resistation(SuccessfulRegistor);
		
		//new Code
		acaws.verify_Successful_Mes_For_Resistation(pu.getUserRegistationMes());
	
	}

	@Then("click on TV menu")
	public void click_on_tv_menu() {
		acaws.click_On_Tv_menu();

	}

	@Then("Add LG LCD TV to WISHLIST")
	public void add_lg_lcd_tv_to_wishlist() throws InterruptedException {
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		acaws.Add_LG_Tv_To_Wishlist();

	}

	@Then("Verify the SUCCESSFUL MESSAGE FOR TV ADDED TO WISHLIST.")
	public void verify_the_successful_message_for_tv_added_to_wishlist() {
		//String wishlist="LG LCD has been added to your wishlist. Click here to continue shopping.";
		//acaws.verify_Sucessful_Add_Message(wishlist);
		
		//new Code
		acaws.verify_Sucessful_Add_Message(pu.getUserWishListMes());
	}

	@Then("Click on SHARE WISHLIST button")
	public void click_on_share_wishlist_button() throws InterruptedException {
		Thread.sleep(2000);
		acaws.click_On_Share_Wishlist_Button();

	}

	@Then("Enter email Id and message and click on SHARE WISHLIST BUTTON")
	public void enter_email_id_and_message_and_click_on_share_wishlist_button() throws InterruptedException {
		Thread.sleep(2000);
		//String emailId="h@gmail.com";
		//String message="This is for demo purpose";
		//acaws.Enter_EmailId_For_Share_Wishlist(emailId);
		//acaws.Enter_Message(message);
		
		//new Code
		acaws.Enter_EmailId_For_Share_Wishlist(pu.getShareEmailId());
		acaws.Enter_Message(pu.getShareMes());
		
		
		js.executeScript("window.scrollBy(0,200)", "");
		acaws.click_On_Final_Share_wishList_button();
	}

	@Then("verify the SUCCESSFUL MESSAGE FOR SHARE WISHLIST.")
	public void verify_the_successful_message_for_share_wishlist() throws InterruptedException {
		Thread.sleep(2000);
		//String shareSuccessfulMes="Your Wishlist has been shared.";
		//acaws.verify_The_Successful_Message_For_Share_Wishlist(shareSuccessfulMes);
		
		//new Code
		acaws.verify_The_Successful_Message_For_Share_Wishlist(pu.getUserWishListShare());
	}

}
