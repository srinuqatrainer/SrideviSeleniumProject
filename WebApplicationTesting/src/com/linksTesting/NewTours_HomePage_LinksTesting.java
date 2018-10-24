package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksTesting {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		System.out.println("Total Number of links on NewTours HomePage are: "+linksCount);
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(i+" "+linkName);
			
			links.get(i).click(); //-- the page is changed
			// when the webPage is changed the stored info in the links is completely deleted
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();			
			// we are recreating the Array again
			links=driver.findElements(By.tagName("a"));
						
		}
		
		
		driver.close();

	}

}
