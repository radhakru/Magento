package com.magento.StepDefination;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Webobject.VerifyLoginUserCanPurchaseOrderObject;

import io.cucumber.java.en.Then;

public class LoginUserPurchaseProduct extends Base {
	private WebDriver driver;
	private VerifyLoginUserCanPurchaseOrderObject vlucpo;
	private JavascriptExecutor js;

	@Then("Login in application using previously created emailID.")
	public void login_in_application_using_previously_created_email_id() throws InterruptedException {
		driver = getDriver();
		vlucpo = new VerifyLoginUserCanPurchaseOrderObject(driver);
		js = (JavascriptExecutor) driver;
		vlucpo.enter_EmailId("wi-005@gmail.com");
		vlucpo.enter_Password("12345678");
		vlucpo.clickOnLoginButton();
		Thread.sleep(2000);

	}

	@Then("click on My WishList links")
	public void click_on_my_wish_list_links() {
		vlucpo.clickOnWishListButton();
	}

	@Then("click on Add to crat")
	public void click_on_add_to_crat() throws InterruptedException {
		vlucpo.clickOnAddToCard();
		Thread.sleep(2000);

	}

	@Then("click on PROCEED TO CHECKOUT")
	public void click_on_proceed_to_checkout() {
		vlucpo.clickOnProceedToCheckOutButton();
	}

	@Then("Select Shipping Information")
	public void select_shipping_information() {
		vlucpo.selectState_And_Religion_And_Pincode_For_Shipping("United States", "New York", "542896");

	}

	@Then("click on ESTIMATE")
	public void click_on_estimate() {
		vlucpo.clickOnEstimate();
		js.executeScript("window.scrollBy(0,200)", "");

	}

	@Then("verify shipping cost generated")
	public void verify_shipping_cost_generated() throws InterruptedException {
		vlucpo.verify_Cost_For_Shopping();
		Thread.sleep(2000);
	}

	@Then("select Shipping Cost and click UPDATE TOTAL")
	public void select_shipping_cost_and_click_update_total() {
		vlucpo.clickOnfixedRadioButton();
		vlucpo.clickOnUpdateButton();
		js.executeScript("window.scrollBy(0,200)", "");
	}

	@Then("verify the shipping cost is added to total")
	public void verify_the_shipping_cost_is_added_to_total() throws InterruptedException {
		Thread.sleep(2000);
		vlucpo.VerifyShoppingprice();
	}

	@Then("click PROCEED TO CHECKOUT")
	public void click_proceed_to_checkout() {
		// js.executeScript("window.scrollBy(0,200)", "");
		vlucpo.clickOnSecondProceedToCheckOutButton();

	}

	@Then("Enter Billing Information")
	public void enter_billing_information() throws InterruptedException {
		js.executeScript("window.scrollBy(0,200)", "");
		vlucpo.Enter_Bill_Address("ABC");
		vlucpo.Enter_Bill_City("Abhayamukhi");
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		vlucpo.Enter_Bill_State("New York");
		vlucpo.Enter_Bill_Zipcode("589765");

		js.executeScript("window.scrollBy(0,200)", "");
		vlucpo.Enter_Bill_Region("United States");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)", "");
		vlucpo.Enter_Bill_PhoneNumber("12345678");
		vlucpo.clickOnContinueForBilling();

	}

	@Then("In Shipping method ,click continue")
	public void in_shipping_method_click_continue() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)", "");
		vlucpo.clickOnShipingContinueButton();
		// js.executeScript("window.scrollBy(0,200)", "");
	}

	@Then("In payment information select check money order radio button")
	public void in_payment_information_select_check_money_order_radio_button() throws InterruptedException {
		Thread.sleep(2000);
		vlucpo.selectPaymentMethodToCheck();
		vlucpo.clickOnPaymentMethodContinueButton();
		Thread.sleep(2000);
	}

	@Then("click on PLACED ORDER button")
	public void click_on_placed_order_button() throws InterruptedException {
		// js.executeScript("window.scrollBy(0,300)", "");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		vlucpo.clickOnPlaceorderButton();
		Thread.sleep(2000);

	}

	@Then("verify order is generated.Note the Order Number.")
	public void verify_order_is_generated_note_the_order_number() {
		vlucpo.verify_Order_Mes_And_Order_Id();

	}

}
