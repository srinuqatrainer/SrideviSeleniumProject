package com.HandlingAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_CheckAvailability_Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <input id="searchBtn" -- click on Check Availability button
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String alertText=alt.getText();
		
		System.out.println(alertText);
		
		Thread.sleep(20000);
		
		alt.accept();
		
		//alt.dismiss();
		
		//alt.sendKeys("hello");
		

	}

}
