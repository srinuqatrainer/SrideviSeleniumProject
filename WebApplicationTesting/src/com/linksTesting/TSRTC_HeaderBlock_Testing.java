package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_Testing {

	public static void main(String[] args) 
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		// <div class="menu-wrap"> -- header
		
		// identifying the hearderBlock of the current webPage
		WebElement headerBlock=driver.findElement(By.className("menu-wrap")); 
		
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerlinksCount=headerBlockLinks.size();
		System.out.println("The total No of links in headerBlock are : "+headerlinksCount);
		
		for(int i=0;i<headerlinksCount;i++)
		{
			String headerBlockLinkName=headerBlockLinks.get(i).getText();
			System.out.println(i+" "+headerBlockLinkName);
			
			headerBlockLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			// Selenium wait -- explicity wait
			Sleeper.sleepTightInSeconds(10);
			
			// Identifying the block of the webPage again
			headerBlock=driver.findElement(By.className("menu-wrap"));
			
			// Recreating the array again -- since the page is changed the stored info in the array will be lost
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
			
			
		}
		
		driver.close();

	}

}
