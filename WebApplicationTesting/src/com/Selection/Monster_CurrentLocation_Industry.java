package com.Selection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		// <select class="border_grey1" -- Current Location Dropdown
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		List<WebElement>cityNames=currentLocation.findElements(By.tagName("option"));
		
		for(int i=0;i<cityNames.size();i++)
		{
			String cityName=cityNames.get(i).getText();
			System.out.println(cityName);
		}
		
		Select selection = new Select(currentLocation);
		
		//selection.selectByIndex(3);
		//selection.selectByValue("491");
		selection.selectByVisibleText("Chennai");
		
		// select id="id_industry" -- Industry
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select sele = new Select(industry);
		
		sele.selectByIndex(1);
		sele.selectByValue("4");
		sele.selectByVisibleText("Banking/ Financial Services");
		
		// deselect all the selected values
		
		sele.deselectAll();
		
		
		//driver.close();

	}

}
