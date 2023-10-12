package com.magento.StepDefination;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.magento.Webobject.ModileitemverifyObject;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mobileitemverify extends Base {
	private WebDriver driver;

	private ModileitemverifyObject mivo;
	private JavascriptExecutor jse;

	@Before
	public void setUP() {
		driver=getDriver();
		driver.manage().window().maximize();
		jse=(JavascriptExecutor)driver;
		
		
	}

	@Given("go to url")
	public void go_to_url() {
		driver.get("http://live.techpanda.org/index.php/");
	}

	@When("verify title of the main page")
	public void verify_title_of_the_main_page() throws InterruptedException {
		mivo = new ModileitemverifyObject(driver);
		mivo.verify_The_Main_Page_Title("Home page");
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
		mivo.verify_The_Mobile_Page_Title("Mobile");
		Thread.sleep(2000);
	}

	@Then("in the list of all mobile . select SORT BY dropdown as name")
	public void in_the_list_of_all_mobile_select_sort_by_dropdown_as_name() {
		mivo.select_Item_By_SORT_Dropdown_As_Name("Name");

	}

	@Then("verify all products are sorted by name.")
	public void verify_all_products_are_sorted_by_name() {
		mivo.sortItemverify();
	}

	@After
	public void tear() {
		driver.close();
	}

}
