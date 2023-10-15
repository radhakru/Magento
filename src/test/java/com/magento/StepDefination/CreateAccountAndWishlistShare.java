package com.magento.StepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Webobject.VerifyCreateAccountAndShareWishlistObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountAndWishlistShare extends Base{
	private WebDriver driver;
	private VerifyCreateAccountAndShareWishlistObject vcaasw;
	private JavascriptExecutor js;

	@When("click on Account")
	public void click_on_account() {
		driver=getDriver();
		vcaasw=new VerifyCreateAccountAndShareWishlistObject(driver);
		js=(JavascriptExecutor)driver;
		vcaasw.clickonAccount();

	}

	@Then("click on CREATE AN ACCOUNT BUTTON")
	public void click_on_create_an_account_button() {
		vcaasw.clickOnCreateAccount();
	}

	@Then("Enter userFirstName {string},userlastName {string},userEmailid {string},userPassword {string},userConfirmPassword {string}")
	public void enter_user_first_name_userlast_name_user_emailid_user_password_user_confirm_password(String string,
			String string2, String string3, String string4, String string5) {
		
		vcaasw.enter_Fistname(string);
		vcaasw.enter_Lastname(string2);
		vcaasw.enter_EmailId(string3);
		js.executeScript("window.scrollBy(0,200)", "");
		vcaasw.enter_Password(string4);
		vcaasw.enter_ConfirmPassword(string5);
	}

	@Then("click on registor button")
	public void click_on_registor_button() throws InterruptedException {
		Thread.sleep(2000);
		vcaasw.clickOnResistorButton();
	}

	@Then("verify the Successful resistation message")
	public void verify_the_successful_resistation_message() {
		String successfulRes="Thank you for registering with Main Website Store.";
		vcaasw.verifythesuccessfulmes(successfulRes);
	}

	@Then("click on Tv menu")
	public void click_on_tv_menu() {
		vcaasw.clickontvmenu();
		js.executeScript("window.scrollBy(0,200)", "");
	}

	@Then("Add LG LCD to wishlist")
	public void add_lg_lcd_to_wishlist() {
		vcaasw.clickonaddtowishlist();
	}

	@Then("click on share wishlist")
	public void click_on_share_wishlist() throws InterruptedException {
		Thread.sleep(2000);
		String addwishListSucessfullmes="LG LCD has been added to your wishlist. Click here to continue shopping.";
		vcaasw.verifytheaddtowishlist(addwishListSucessfullmes);
		vcaasw.clickonShareWishlistButton();
	}

	@Then("Enter share emailid and message")
	public void enter_share_emailid_and_message() {
		vcaasw.enterShareEmaildAndMessage("h@gmail.com", "This is for only demo purpose.");
		js.executeScript("window.scrollBy(0,200)", "");
		vcaasw.clickonFinalWishListShareButton();
	}

	@Then("verify the successful message for share wishlist")
	public void verify_the_successful_message_for_share_wishlist() {
		String sharedSuccessMes="Your Wishlist has been shared.";
		vcaasw.verify_Successful_Share_Wishlist_Mesaage(sharedSuccessMes);
	}

}
