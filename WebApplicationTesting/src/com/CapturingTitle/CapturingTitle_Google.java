package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String actual_Title=driver.getTitle();
		System.out.println("The title of Google WebPage is: "+actual_Title);
		
		driver.close();

	}

}
