package com.magento.Webobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CompareProductsObject {

	private WebDriver ldriver;
	private MobileitemverifyObject mivo;
	private String parent;
	private Actions action;

	private JavascriptExecutor js;

	public CompareProductsObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public WebDriver getDriver() {
		return ldriver;
	}

	//private By com=By.linkText("Add to Compare");
	private By compare = By.xpath("//a[@class='link-compare']");

	private By IphoneLink = By.xpath("(//a[contains(text(),'Add to Compare')])[1]");
	private By sonyLink = By.xpath("(//a[contains(text(),'Add to Compare')])[3]");

	private By compareButton = By.xpath("(//*[contains(text(),'Compare')])[5]");
	private By compareItem = By.xpath("//h2[@class='product-name']/a");

	public void click_On_Mobile_For_Add_To_Compare() {
		js = (JavascriptExecutor) ldriver;
		/*
		 * mivo = new MobileitemverifyObject(ldriver); String[] arr = mivo.sortItem();
		 */

		/*
		 * for(int i=0;i<arr.length;i++) { //System.out.println(arr[i]); /*
		 * if(arr[i].equals("IPHONE")) {
		 * action.moveToElement(Addto.get(i)).click().build().perform();; } else
		 * if(arr[i].equals("SONY XPERIA")) { System.out.println(arr[i]);
		 * ldriver.navigate().refresh();
		 * action.moveToElement(Addto.get(i)).click().build().perform();; }
		 * 
		 * 
		 * 
		 * }
		 */
		//js.executeScript("window.scrollBy(0,200)", "");
		//List<WebElement> com=ldriver.findElements(compare);
		
			
			
		
		
		
		
		
		  ldriver.findElement(IphoneLink).click();
		  js.executeScript("window.scrollBy(0,200)", "");
		  ldriver.findElement(sonyLink).click();
	}

	public void click_On_Compare_Button() {
		parent = ldriver.getWindowHandle();
		ldriver.findElement(compareButton).click();

	}

	public void verify_Compare_Items(String name1, String name2) throws AWTException {

		Set<String> all = ldriver.getWindowHandles();
		System.out.println(all.size());
		Iterator<String> window = all.iterator();
		Boolean value = false;
		while (window.hasNext()) {
			ldriver.switchTo().window(window.next());
			System.out.println("Title="+ldriver.getTitle());

			List<WebElement> item = ldriver.findElements(compareItem);
			String[] compareListItem = new String[item.size()];
			//store CompareListItem all element to the String
			for (int i = 0; i < item.size(); i++) {
				compareListItem[i] = item.get(i).getText();
				System.out.println("items="+compareListItem[i]);
			}
			//for comparison
			for (String str : compareListItem) {
				if (str.equals(name1) || str.equals(name2)) {
					value = true;
				}
			}
		}
		//first close the pop-up window
		ldriver.close();
		ldriver.switchTo().window(parent);
		Assert.assertTrue(value);

	}

	public void close_The_Pop_Up() {
		//Then switch to parent window.
		ldriver.switchTo().window(parent);

	}

}
