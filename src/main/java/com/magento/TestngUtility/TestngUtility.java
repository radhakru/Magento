package com.magento.TestngUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestngUtility {
	
	private FileInputStream fio;
	private Properties prop;
	private File file;
	
	
	
	private FileInputStream getPropertiesFile() throws FileNotFoundException {
		file=new File(System.getProperty("user.dir")+"//Property//property.properties");
		fio=new FileInputStream(file);
		return fio;
	}
	
	private void getAccessFile() throws FileNotFoundException, IOException {
		prop=new Properties();
		prop.load(getPropertiesFile());
		
	}
	
	public String getUrl(){
		try {
			getAccessFile();
		} catch (FileNotFoundException e) {
			System.out.println("FilenotFoundExecption= "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException ="+e.getMessage());
		}
		String url=prop.getProperty("url");
		return url;
		
	}
	public String getHomepageTitle() {
		try {
			getAccessFile();
		} catch (FileNotFoundException e) {
			System.out.println("FilenotFoundExecption= "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException ="+e.getMessage());
		}
		
		String homePageTitle=prop.getProperty("Hptitle");
		return homePageTitle;
	}
	
	public String getMobilePageTitle() {
		try {
			getAccessFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mobilePage_Title=prop.getProperty("Mptitle");
		return mobilePage_Title;
	}
	
	public String getSelect() {
		try {
			getAccessFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name=prop.getProperty("SortBy");
		return name;
	}
	
	
	

}
