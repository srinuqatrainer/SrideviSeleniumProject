package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperations {

	public static void main(String[] args) throws IOException
	{
		// Identifying the file in the System dynamically using - System.getProperty("user.dir")
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelReadFiles\\ExcelWriteOperation.xlsx");
		
		// Printing the path of the Project located in the current System
		System.out.println(System.getProperty("user.dir"));
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// creating a row in the sheet
		Row r=sheet.createRow(2);
		// Creating a cell in the Row
		Cell c=r.createCell(3);
		
		// Setting a Value in the Row of a Cell Created
		c.setCellValue("SriDevi");
		
		// Sending the data in the OutPut file
		FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelReadFiles\\ExcelWriteOperation.xlsx");
		// Saving the WorkBook of the File
		workBook.write(file1);

	}

}
