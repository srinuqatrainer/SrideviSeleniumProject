package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args)
	{
		// FireFoxDriver is a class used to Automate FireFox Browser
		// we create an Object to the Class 
		
		// Class       Object
		FirefoxDriver sridevi = new FirefoxDriver();
		
		// Object always represents to the Class itself
		// Open an application URL on the Browser using get()  
		
		sridevi.get("http://google.com");
		
		sridevi.navigate().to("http://facebook.com");
		
		// to close the Browser
		// sridevi.close();

	}

}
