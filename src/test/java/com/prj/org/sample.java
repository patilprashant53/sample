package com.prj.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.prj.org.Sam_Class.Download_Class;
import com.prj.org.Sam_Class.Link_Class;
import com.prj.org.Sam_Class.LogIn;
import com.prj.org.Sam_Class.Products_Class;
import com.prj.org.Sam_Class.Sign_Class;


public class sample {
	
	WebDriver driver;

  @Test
  public void second()
  {
	Sign_Class ref1=new Sign_Class(driver);
	ref1.start();
  }
  
  @Test(dependsOnMethods={"second"})
  public void third() throws InterruptedException
  {
	  LogIn ref2 =new LogIn(driver);
		ref2.run();
  }
  
  @Test(enabled=false)
  public void fourth()
  {
	  Download_Class ref3 =new Download_Class(driver);
		ref3.down();
  }
  
  @Test(priority=4)
 
  public void fifth()
  {

		Link_Class ref4=new Link_Class(driver);
		ref4.pic();
  }
  
  @Test(priority=5)
  public void sixth()
  {
	  Products_Class ref5=new Products_Class(driver);
	ref5.pro();
  }
  
  @BeforeMethod
  public void method()
  {
	  System.out.println("This is the home page");
	  System.out.println("hiiiiii");
	  driver.get("https://dev.tracko.co.in/");
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }


  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test");
		driver.quit();

  }

}
