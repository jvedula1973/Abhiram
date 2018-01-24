package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By userName = By.id("user_Login");
	By pwd = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	public LoginPage(WebDriver drv)
	{
		this.driver = drv;
		
	}
	
	public void typeUserName()
	{
		
		driver.findElement(userName).sendKeys("admin");
	}
	
	public void typePassword()
	{
		driver.findElement(pwd).sendKeys("demo123");

	}
	
	public void clickOnLogin()
	{
		driver.findElement(loginButton).click();
	}
	
	
}
