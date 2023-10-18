package com.magento.Utility;

import java.io.File;
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
	
	
}
