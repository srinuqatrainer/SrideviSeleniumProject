package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowser {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\SrideviSelenium\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Edge Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\SrideviSelenium\\WebApplicationTesting\\driverFiles\\MicrosoftWebDriver.exe");
		EdgeDriver drive = new EdgeDriver();
		
		// IE Browser
		System.setProperty("webdriver.ie.driver", "C:\\Users\\srinivas1\\Desktop\\SrideviSelenium\\WebApplicationTesting\\driverFiles\\IEDriverServer.exe");
		InternetExplorerDriver dri = new InternetExplorerDriver();
		
		
		
		

	}

}
