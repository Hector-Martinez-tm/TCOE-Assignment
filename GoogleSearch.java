package com.demo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.excelant.ExcelAntTask;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class GoogleSearch {
	public static void main(String[] args){
		// set path for geckodriver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shivkanya.jadhav\\Downloads\\geckodriver-v0.23.0-win64.exe");											
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette",true); 
		 //created an instance 
		WebDriver driver= new FirefoxDriver();
		//Store url into string variable
		String url="https://www.google.com/" ;
		// get url to launch google application
		driver.get(url);
		WebElement searchboxelement = driver.findElement(By.id("lst-ib")); 
	
		String filePath = "C:\\Users\\shivkanya.jadhav\\workspace";
		String fileName = "Book2";
		String sheetName= "Sheet1";
		int RowNum=1; 
		int ColNum=2;	    
		//Created an instance of File class to open excel file
		FileInputStream ExcelFile = new FileInputStream(filePath);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelAntTask.getSheet(sheetName);
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		searchboxelement.sendKeys("CellData"); 
		searchboxelement.submit();	 

		driver.close();
	}

}
