package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
/*
 
 <a id="gb_70" class="gb_ve gb_Aa gb_Fb" target="_top" 
href="https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=
https://www.google.com/">Sign in</a>
 */
		
		driver.findElement(By.linkText("Sign in")).click();
		String actual_Title=driver.getTitle();
		System.out.println(actual_Title);
		
		driver.close();

	}

}
