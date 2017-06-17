package com.prj.org.Sam_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Download_Class 

{
	WebDriver driver;
	
	public Download_Class(WebDriver driver)
	{
		this.driver=driver;
	}

	public void down()
	{
		driver.findElement(By.xpath("//a[text()='Download App']")).click();
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//("//a[contains(text(),' Testing ')]")).click();

	}
}
