package com.prj.org.Sam_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_Class
{
  WebDriver driver;
 
  public Products_Class(WebDriver driver)
  {
	  this.driver=driver;
	  
  }
  public void pro()
  {
	  driver.findElement(By.xpath("//a[text()='Products']")).click();
  }
}
