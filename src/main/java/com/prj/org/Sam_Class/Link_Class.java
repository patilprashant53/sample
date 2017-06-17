package com.prj.org.Sam_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Link_Class
{
	WebDriver driver;
	
	public Link_Class(WebDriver driver)
	{
		this.driver=driver;
		
	}
public  void pic(){
	
	driver.findElement(By.xpath("//a[text()='Link Device']")).click();
}

}
