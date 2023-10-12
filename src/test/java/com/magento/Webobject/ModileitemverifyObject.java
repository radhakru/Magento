package com.magento.Webobject;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ModileitemverifyObject {

	private WebDriver ldriver;
	private Select select;
	// two pointers
	private static int prev = 0;
	private static int pres = 0;

	public ModileitemverifyObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	private By Mobile = By.xpath("//a[contains(text(),'Mobile')]");
	private By SortBy = By.xpath("//select[@title='Sort By']");
	private By ItemList = By.xpath("//li[@class='item last']/div/h2/a");

	// Encapsulation
	public By getMobile() {
		return Mobile;
	}

	public By getSortBy() {
		return SortBy;
	}

	public By getItemList() {
		return ItemList;
	}

	public void verify_The_Main_Page_Title(String title) {
		boolean value = (ldriver.getTitle().equals(title)) ? true : false;
		Assert.assertTrue(value);

	}

	public void clickOnMobileMenu() {
		ldriver.findElement(Mobile).click();
	}

	public void verify_The_Mobile_Page_Title(String title) {
		Assert.assertEquals(ldriver.getTitle(), title);

	}

	public String[] sortItem() {
		List<WebElement> arr = ldriver.findElements(ItemList);
		String item[] = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			item[i] = arr.get(i).getText();
		}
		Arrays.sort(item);
		return item;
	}

	public void select_Item_By_SORT_Dropdown_As_Name(String name) {
		select = new Select(ldriver.findElement(SortBy));
		select.selectByVisibleText(name);

	}

	public void sortItemverify() {
		String arr[] = sortItem();
		for(String str:arr) {
			System.out.println("arr String= "+str);
		}
		

		List<WebElement> arr1 = ldriver.findElements(ItemList);
		String item[] = new String[arr1.size()];
		for (int i = 0; i < arr1.size(); i++) {
			//System.out.println(arr1.get(i).getText());
			item[i] = arr1.get(i).getText();
		}
		for(String str:item) {
			System.out.println("item String= "+str);
		}
		
		
		
		boolean value = verifyEqual(arr, item);
		System.out.println(value);
		Assert.assertTrue(value);

	}

	public static boolean verifyEqual(String arr[], String arr1[]) {
		//boolean value = false;
		while (prev < arr.length && pres < arr1.length) {
			if (arr[prev].equals(arr1[pres])) {
				prev++;
				pres++;
			}
			else {
				return false;
			}
		
		}
		return true;

	}

}
