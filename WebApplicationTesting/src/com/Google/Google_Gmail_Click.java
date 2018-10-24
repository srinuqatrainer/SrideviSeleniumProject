package com.Google;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
	//	<a class="gb_P" href="https://mail.google.com/mail/?tab=wm" data-pid="23">Gmail</a>

	//	WebDriver locator - className 
	//	selectior - gb_P
		
		driver.findElementByClassName("gb_P").click();
		
		String actual_Title=driver.getTitle();
		System.out.println(actual_Title);
		
		driver.close();

	}

}
