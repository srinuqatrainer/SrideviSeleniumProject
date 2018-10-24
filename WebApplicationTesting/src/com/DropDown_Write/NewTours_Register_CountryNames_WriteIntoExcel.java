package com.DropDown_Write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames_WriteIntoExcel {

	public static void main(String[] args) throws IOException
	{
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// <a href="mercuryregister.php">REGISTER</a>
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	// <select size="1" name="country">
	
	WebElement country=driver.findElement(By.name("country"));
	
	List<WebElement>coutryNames=country.findElements(By.tagName("option"));
	
	System.out.println(coutryNames.size());
	
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelReadFiles\\ExcelWriteOperation.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
		
	for(int i=0;i<coutryNames.size();i++)
	{
		Row r=sheet.createRow(i);
		Cell c=r.createCell(0);
		
		String countryName=coutryNames.get(i).getText();
		System.out.println(countryName);
		
		c.setCellValue(countryName);
		
		FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelReadFiles\\ExcelWriteOperation_CountryNames.xlsx");
		workBook.write(file1);
	}
	
	driver.close();
		
	}

}
