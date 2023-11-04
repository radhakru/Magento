package com.magento.TestngUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelFile {

	private  XSSFWorkbook xssfworkbook;
	private  XSSFSheet xssfSheet;
	private  XSSFRow xssfRow;
	private  XSSFCell xssfCell;

	private FileInputStream fis;
	
	
	
	
	/*
	 * @Test(dataProvider="LoginData") public void Test(String name,String password)
	 * { System.out.println(name.trim()); System.out.println(password.trim());
	 * 
	 * 
	 * }
	 */
	 
	@DataProvider(name="LoginData")
	
	public Object[][] getFile() {
		Object[][] object;
		int rowsize;
		int cellSize;
		int cellValue;
		
		
		
		File file=new File(System.getProperty("user.dir") + "//DataDriven//userLoginData.xlsx");
		if(file.exists()) {
		try {
			fis = new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			xssfworkbook=new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}	
		else {
			System.out.println("File Doesnot exist...");
		
		}
		
		
		xssfSheet=xssfworkbook.getSheet("UserLoginData");
		 rowsize=xssfSheet.getLastRowNum();
		 cellValue=xssfSheet.getRow(0).getLastCellNum();
		 cellSize=Integer.valueOf(cellValue);
		
		System.out.println(rowsize);
		System.out.println(cellSize);
		
		
		//initialize the Object[][].
		object=new String[rowsize][cellSize]; 
		
		//store all the excel value to two dimensional array which is object[][].
		for(int i=1;i<=rowsize;i++) {
			for(int j=0;j<cellSize;j++) {
				System.out.println(xssfSheet.getRow(i).getCell(j).getStringCellValue());
				object[i-1][j]=xssfSheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		System.out.println(object.length);
		//return this 
		
		return object;
		
		
		
		
	}
		
		
		
}
	


