package com.KeyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
// <input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		
		// locator - id
		// Selection - email
		
		driver.findElement(By.id("email")).sendKeys("sridevi");
		
		// Keyboard Operations -- using Actions Class
		
		Actions act = new Actions(driver);
		
		// using TAB key operation from the KeyBoard using Actions class object
		
		act.sendKeys(Keys.TAB).build().perform();
		
		// automating Password Element using Actions class Object
		
		act.sendKeys("Hello").build().perform();
		
		// Using ENTER key on the KeyBoard
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		

	}

}
