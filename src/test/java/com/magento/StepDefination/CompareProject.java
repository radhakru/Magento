package com.magento.StepDefination;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Utility.PropertiesUtility;
import com.magento.Webobject.CompareProductsObject;

import io.cucumber.java.en.Then;

public class CompareProject extends Base {
	
	private WebDriver driver;
	private CompareProductsObject cpo;
	private JavascriptExecutor js;
	private PropertiesUtility pu;
	
	
	@Then("click on add to compare button for two phone")
	public void click_on_add_to_compare_button_for_two_phone() throws InterruptedException {
	   driver=getDriver();
	   cpo=new CompareProductsObject(driver);
	   js=(JavascriptExecutor)driver;
	   pu=getPropertiesClass();
	   cpo.click_On_Mobile_For_Add_To_Compare();
	   Thread.sleep(2000);
	}

	@Then("click on compare button")
	public void click_on_compare_button() {
	    cpo.click_On_Compare_Button();
	}

	@Then("verify the pop-up and mobile names")
	public void verify_the_pop_up_and_mobile_names() throws AWTException {
		//cpo.verify_Compare_Items("IPHONE", "SONY XPERIA");
		
		
		//new Code
		cpo.verify_Compare_Items(pu.getIPhoneText(), pu.getSonyExperiaText());
	}

	@Then("close the pop-up.")
	public void close_the_pop_up() {
		cpo.close_The_Pop_Up();
	}


}
