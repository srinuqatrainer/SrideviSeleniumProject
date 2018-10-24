package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_DragAndDrop {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Switch to a particular frame of the WebPage -- to identify the Elements in it
		// <iframe class="demo-frame" src="/resources/demos/droppable/default.html">
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// <div id="draggable"
		WebElement dragAnElement=driver.findElement(By.id("draggable"));
		
		// <div id="droppable" 
		WebElement dropElementLocation=driver.findElement(By.id("droppable"));
		
		// Mouse Operation to drag and drop and element -- using Actions class
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragAnElement, dropElementLocation).build().perform();
		
	}

}
