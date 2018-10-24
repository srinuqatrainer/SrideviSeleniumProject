package com.MouseHoverOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		// Maximize Browser
		driver.manage().window().maximize();
		
		// Wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// <a id="nav-link-yourAccount"
		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		// Mouse 0r Keyboard Operation -- se use Actions Class
		
		Actions act = new Actions(driver);
		
		// with the help of Actions class Object we perform the operation
		act.moveToElement(helloSignIn).build().perform();
		
		
		

	}

}
