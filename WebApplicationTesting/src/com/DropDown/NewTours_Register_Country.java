package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// <select size="1" name="country">
		WebElement country=driver.findElement(By.name("country"));
		
		// dropDown will have a option tag -- get all the elements for the dropdown(Country) and save in ArrayList
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		int countryCount=countryNames.size();
		System.out.println("Total Number of Countries are : "+countryCount);
				
		for(int i=0;i<countryCount;i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(i+"  "+countryName);
		}
		driver.close();	

	}

}
