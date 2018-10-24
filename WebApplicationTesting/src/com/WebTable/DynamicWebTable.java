package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Identify the Table of the WebPage
		// html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table 

		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table"));
		
		// get into the table and identify how many rows are existing in it
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) // going into every ROW
		{
			// going into a particular Row and indentifying how many columns are there
			List<WebElement>Cols=rows.get(i).findElements(By.tagName("td")); 
			
			for(int j=0;j<Cols.size();j++)
			{
				String data=Cols.get(j).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
			
		}
		driver.close();	
		
		
	}

}
