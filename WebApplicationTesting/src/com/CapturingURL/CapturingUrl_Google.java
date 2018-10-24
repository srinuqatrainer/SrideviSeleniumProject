package com.CapturingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("The Url of Google application is: "+actual_Url);
		
		driver.close();

	}

}
