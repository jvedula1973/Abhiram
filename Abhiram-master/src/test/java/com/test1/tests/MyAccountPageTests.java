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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhiram\\workspace\\Abhiram-master\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	
  @Test
  public void testSuccessfulLogin() throws InterruptedException  {
	  
	 
		
	   	driver.manage().window().maximize();
	   	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("jvedula1973@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("prAsanna");
		driver.findElement(By.name("SubmitLogin")).click();
	  
	  Assert.assertTrue(driver.findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
	  driver.findElement(By.className("logout")).click();
	  
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
