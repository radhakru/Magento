package com.magento.StepDefination;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Utility.PropertiesUtility;
import com.magento.Webobject.VerifyYourPreviousOrderCanBeSaveAsPdfObject;

import io.cucumber.java.en.Then;

public class VerifyYourPreviousOrderCanSaveAsPDF extends Base{
	private WebDriver driver;
	private JavascriptExecutor js;
	private VerifyYourPreviousOrderCanBeSaveAsPdfObject vypocbsap;
	private PropertiesUtility pu;
	
	@Then("click on MY ORDER link")
	public void click_on_my_order_link() {
		driver=getDriver();
		pu=getPropertiesClass();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		vypocbsap=new VerifyYourPreviousOrderCanBeSaveAsPdfObject(driver);  
		vypocbsap.clickOnMyOrderLink();
	}

	@Then("Verify the order Id and status is pending")
	public void verify_the_order_id_and_status_is_pending() {
		//String orderId="100020165";
	   // vypocbsap.verifyOrderIdAndStatus(orderId);
		
		
		//new Code
		 vypocbsap.verifyOrderIdAndStatus(pu.getOrderId());
	}

	@Then("click on VIEW ORDER link")
	public void click_on_view_order_link() {
	    vypocbsap.clickOnViewOrder();
	}

	@Then("click on Print Order")
	public void click_on_print_order() {
		vypocbsap.clickOnPrintOrder();
	   
	}

	@Then("verify the product file save as pdf")
	public void verify_the_product_file_save_as_pdf() throws AWTException, InterruptedException {
		vypocbsap.verifyOrderFileSaveAsPdf();
	 System.out.println("Hello");
	}
	
	

}
