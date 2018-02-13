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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhiram\\workspace\\web-automation\\Selenium_Automation\\src\\chromedriver.exe");
		driver = new ChromeDriver();
	}
  @Test
  public void TestSuccessfulLogin() throws InterruptedException  {
   	driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  driver.findElement(By.id("email")).sendKeys("jvedula1973@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("prAsanna");
	  driver.findElement(By.name("SubmitLogin")).click();
	  
	  Assert.assertTrue(driver.findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  
	 driver.close();
	 driver.quit();
  }
   
}
