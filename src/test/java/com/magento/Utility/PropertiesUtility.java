package com.magento.Utility;


import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	private FileInputStream fos;
	private Properties property;
	
	
	public FileInputStream getPropertiesFile()   {
		try {
			fos=new FileInputStream(System.getProperty("user.dir")+"//Property//property.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fos;
	}
	
	protected void loadProperties() {
		property=new Properties();
		try {
			property.load(getPropertiesFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		loadProperties();
		String url=property.getProperty("url");
		return url;
		
		
	}
	public String getHomepageTitle() {
		loadProperties();
		String homePageTitle=property.getProperty("Hptitle");
		return homePageTitle;
	}
	public String getMobilepageTitle() {
		loadProperties();
		String mobilePageTitle=property.getProperty("Mptitle");
		return mobilePageTitle;
	}
	public String SortByName() {
		loadProperties();
		String sortName=property.getProperty("SortBy");
		return sortName;
	}
	
	public String getuserEmailId() {
		loadProperties();
		String emailId=property.getProperty("userEmailId");
		return emailId;
		
	}
	public String getuserPassword() {
		loadProperties();
		String password=property.getProperty("userPassword");
		return password;
		
	}
	public String getshippingState() {
		loadProperties();
		String state=property.getProperty("ShippingState");
		return state;
		
	}
	public String getshippingReligon() {
		loadProperties();	
		String Religon=property.getProperty("ShippingReligon");
		return Religon;
	}
	
	public String getshippingPincode() {
		loadProperties();
		String Pincode=property.getProperty("ShippingPincode");
		return Pincode;
	}
	public String getbillAddress() {
		loadProperties();
		String address=property.getProperty("BillAddress");
		return address;
	}
	public String getbillCity() {
		loadProperties();
		String city=property.getProperty("BillCity");
		return city;
	}
	public String getbillState() {
		loadProperties();
		String state=property.getProperty("BillState");
		return state;
	}
	public String getbillZipCode() {
		loadProperties();
		String ZipCode=property.getProperty("BillZipCode");
		return ZipCode;
	}
	public String getbillRegison() {
		loadProperties();
		String Religon=property.getProperty("BillReligon");
		return Religon;
	}
	public String getbillPhoneNumber() {
		loadProperties();
		String PhoneNumber=property.getProperty("BillPhoneNumber");
		return PhoneNumber;	
	}
	public String getUserRegistationMes() {
		loadProperties();
		String RegistationMes=property.getProperty("RegistationScuccessFulMes");
		return RegistationMes;
	}
	public String getUserWishListMes() {
		loadProperties();
		String WishListMes=property.getProperty("TvAddedMes");
		return WishListMes;
		
	}
	public String getUserWishListShare() {
		loadProperties();
		String ShareWishlistMes=property.getProperty("ShareWishlistMes");
		return ShareWishlistMes;
		
	}
	public String getShareEmailId() {
		loadProperties();
		String emailId=property.getProperty("ShareEmailId");
		return emailId;
	}
	
	public String getShareMes() {
		loadProperties();
		String shareMes=property.getProperty("ShareMes");
		return shareMes;
	}
	public String getIPhoneText() {
		loadProperties();
		String iphone=property.getProperty("iphoneText");
		return iphone;
	}
	
	public String getSonyExperiaText() {
		loadProperties();
		String sonyExperia=property.getProperty("SonyExperiaText");
		return sonyExperia;
	}
	
	
	public String getProductSuccessfullyAdded() {
		loadProperties();
		String productMesAdded=property.getProperty("ProductSuccessfulAdded");
		return productMesAdded;
	}
	public String getProductQunatity() {
		loadProperties();
		String productQunatity=property.getProperty("ProductQuntityErrorMes");
		return productQunatity;
	}
	public String getCartMes() {
		loadProperties();	
		String CartMes=property.getProperty("EmptyCardMes");
		return CartMes;
	}
	public String getOrderId() {
		loadProperties();
		String orderId=property.getProperty("OrderId");
		return orderId;
	}
	
	
}
