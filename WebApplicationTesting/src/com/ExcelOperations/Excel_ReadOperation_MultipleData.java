package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation_MultipleData {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\SrideviSelenium\\WebApplicationTesting\\ExcelTestDataFiles\\SrideviMultipleTestData.xlsx");
	
		XSSFWorkbook workBook = new XSSFWorkbook(file);	
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// identifying how many rows are existing with the data
		int rowCount=sheet.getLastRowNum();
		
		// to goto Every Row of the Sheet
		for(int i=0;i<=rowCount;i++)
		{
			// going to a particular row
			Row r=sheet.getRow(i);
			
			// in the row that we are in -- we need to identify how many cell are existing with data
			int cellCount=r.getLastCellNum();
			
			// going to every row of all Cell --to get the data
			for(int j=0;j<cellCount;j++)
			{
				Cell c=r.getCell(j);
				
				String data=c.getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
			
			
			
		}
		
		
		

	}

}
