package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation_SingleData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\SrideviSelenium\\WebApplicationTesting\\ExcelTestDataFiles\\SrideviTestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identify the 0th row
		Row r=sheet.getRow(0);
		// in the 0th row identify the 0th cell
		Cell c=r.getCell(0);
		
		// from the 0th row of 0th cell get the data
		String data=c.getStringCellValue();
		
		System.out.println(data);
		

	}

}
