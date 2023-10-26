package com.magento.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.magento.Webobject.MobilecostverifyObject;

import io.cucumber.java.en.*;

public class Mobilecostverify extends Base {

	private WebDriver driver;
	private MobilecostverifyObject mcvo;
	private JavascriptExecutor js;

	@When("click on the Mobile menu page")
	public void click_on_the_mobile_menu_page() {
		driver = getDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mcvo = new MobilecostverifyObject(driver);
		js = (JavascriptExecutor) driver;
		mcvo.click_on_mobile_menu();
		js.executeScript("window.scrollBy(0,200)", "");

	}

	@Then("In the list of all mobile,read the cost of the sony xperia mobile.")
	public void in_the_list_of_all_mobile_read_the_cost_of_the_sony_xperia_mobile() {
		mcvo.grapPrice_Of_Mobile();
	}

	@Then("click on sony xperia mobile")
	public void click_on_sony_xperia_mobile() throws InterruptedException {
		Thread.sleep(2000);
		mcvo.click_on_sony_xperia();

	}

	@Then("read the cost of sony xperia form details page.")
	public void read_the_cost_of_sony_xperia_form_details_page() {
		mcvo.grap_Price_Of_Sony_Xperia();
	}

	@Then("compare value in both page.")
	public void compare_value_in_both_page() {
		mcvo.isEqual();
	}

}
