package com.test1.tests;
import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class MyAccountPageTests 
{
	 WebDriver driver = null;
	@BeforeTest
	public void beforeTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhiram\\workspace\\web-automation\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	
  @Test
  public void TestSuccessfulLogin() throws InterruptedException  {
	  
	 
		
	   	driver.manage().window().maximize();
	  driver.get("http://test1.absofttrainings.com/my-account/");
	  driver.findElement(By.id("username")).sendKeys("testuser1");
	  driver.findElement(By.id("password")).sendKeys("testpwd1");
	  driver.findElement(By.name("login")).click();
	  
	  Assert.assertTrue(driver.findElement(By.id("user_info")).getText().contains("testuser1"));
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  
	 driver.close();
  }
  
  @Test
  public void TestAnchorTag() throws InterruptedException
  {
	
	  
	  List<WebElement> list = driver.findElements(By.cssSelector("order-number"));
													
      for (WebElement element : list) {
          String link = element.getAttribute("href");
          System.out.println(element.getTagName() + "=" + link +", "+ element.getText());
      }
	  
	  
	  
	  
//	  driver.findElement(By.xpath("//a[contains('#299')]")).click();
	  Assert.assertTrue(driver.findElement(By.name("order-info")).isDisplayed());
	  
	  
	  
  }
  
  
}
