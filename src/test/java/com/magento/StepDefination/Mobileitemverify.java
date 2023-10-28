package com.magento.StepDefination;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.magento.Utility.PropertiesUtility;
import com.magento.Webobject.MobileitemverifyObject;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mobileitemverify extends Base {
	private static WebDriver driver;

	private MobileitemverifyObject mivo;
	private JavascriptExecutor jse;
	private PropertiesUtility pu;

	@Before
	public void setUP() {
		driver=getDriver();
		driver.manage().window().maximize();
		jse=(JavascriptExecutor)driver;
		pu =getPropertiesClass();
		
	}

	@Given("go to url")
	public void go_to_url() {
		
		//driver.get("http://live.techpanda.org/index.php/");
		driver.get(pu.getUrl());
	}

	@When("verify title of the main page")
	public void verify_title_of_the_main_page() throws InterruptedException {
		mivo = new MobileitemverifyObject(driver);
		
		
		//mivo.verify_The_Main_Page_Title("Home page");
		
		//new code
		mivo.verify_The_Main_Page_Title(pu.getHomepageTitle());
		Thread.sleep(2000);

	}

	@Then("click on the Mobile menu")
	public void click_on_the_mobile_menu() {
		mivo.clickOnMobileMenu();
		//jse.executeScript("window.scrollBy(0,200)","");
		jse.executeScript("window.scrollBy(0,200)","");

	}

	@Then("verify title of the mobile page")
	public void verify_title_of_the_mobile_page() throws InterruptedException {
		
		//need to change
		//mivo.verify_The_Mobile_Page_Title("Mobile");
		
		//new code
		mivo.verify_The_Mobile_Page_Title(pu.getMobilepageTitle());
		Thread.sleep(2000);
	}

	@Then("in the list of all mobile . select SORT BY dropdown as name")
	public void in_the_list_of_all_mobile_select_sort_by_dropdown_as_name() {
		
		//mivo.select_Item_By_SORT_Dropdown_As_Name("Name");
		
		
		//new code
		mivo.select_Item_By_SORT_Dropdown_As_Name(pu.SortByName());

	}

	@Then("verify all products are sorted by name.")
	public void verify_all_products_are_sorted_by_name() {
		mivo.sortItemverify();
	}

	@AfterAll
	public static void tear() {
		driver.close();
	}
	@AfterStep
	public void takeScreenShot(Scenario scenario) {
		addScreenshot(scenario);
	}
	

}
