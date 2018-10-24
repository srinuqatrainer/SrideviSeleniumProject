package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		// <a id="gb_70" 
		
		driver.findElement(By.id("gb_70")).click();
		
		String actual_Title=driver.getTitle();
		System.out.println(actual_Title);
		
		driver.close();

	}

}
