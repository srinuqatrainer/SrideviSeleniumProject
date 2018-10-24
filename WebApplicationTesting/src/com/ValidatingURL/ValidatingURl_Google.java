package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingURl_Google {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String expected_Url="google.com";
		System.out.println("Client expected text in the URL :"+ expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("The Url of Google application is: "+actual_Url);
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println("URL Matched -- PASS");
		}
		else
		{
			System.out.println("Url not matched -- FAIL");
		}
		
		driver.close();
	}

}
