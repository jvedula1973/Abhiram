
package com.test1.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.tests.pages.LoginPage;


public class VerifyLogin {

	@Test
	public void VerifyValidLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		LoginPage page = new LoginPage(driver);
		page.typeUserName();
		page.typePassword();
		page.clickOnLogin();
		
		
	}
	
}
