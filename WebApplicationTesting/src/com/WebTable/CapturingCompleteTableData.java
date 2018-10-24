package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteTableData {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		String part1="html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int i=1;i<=36;i++) // For Rows
		{
			for(int j=1;j<=8;j++) // of ever Row -- it goes to every column
			{
				String data=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		driver.close();

	}

}
