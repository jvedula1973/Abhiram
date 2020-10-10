package com.stf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTests {
	private static final Logger logger = LogManager.getLogger(RunTests.class);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {

			System.out.println("testing framework.");
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\git\\Prasanna\\src\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();
			// WebDriver driver = new FirefoxDriver();
			// FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			String baseUrl = "http://demo.guru99.com/test/newtours/";

			String expectedTitle = "Welcome: Mercury Tours";
			String actualTitle = "";

			driver.get(baseUrl);

			actualTitle = driver.getTitle();

			if (actualTitle.contentEquals(expectedTitle)) {
				logger.info("Test Passed!");
			} else {
				logger.info("Test Failed");
			}

			// close Fire fox
			if (driver != null) {
				driver.quit();
			}
		} catch (Exception ex) {

			throw ex;
		}

	}

	public void TestLogin() throws Exception {
		try {

			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\git\\Prasanna\\src\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--no-sandbox");
//			options.addArguments("--disable-dev-shm-usage");
			String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
			driver.get(baseUrl);
			driver.findElement(By.xpath(
					"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
					.sendKeys("user1");
			driver.findElement(By.xpath(
					"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"))
					.sendKeys("Password1");
			driver.findElement(By.xpath(
					"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
					.click();
			driver.close();
		}

		catch (Exception ex) {
			logger.error(ex.getMessage());
			throw ex;
		}

	}

	public void TestTitle() throws Exception {
		try {
			logger.info("testing framework.");

			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\git\\Prasanna\\src\\drivers\\chromedriver.exe");
//			WebDriverManager.chromedriver().clearResolutionCache().forceDownload()
//            .setup();
//			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--no-sandbox");
//			options.addArguments("--disable-dev-shm-usage");

			String baseUrl = "http://demo.guru99.com/test/newtours/";

			String expectedTitle = "Welcome: Mercury Tours";
			String actualTitle = "";

			driver.get(baseUrl);

			actualTitle = driver.getTitle();

			if (actualTitle.contentEquals(expectedTitle)) {
				logger.info("Test Passed!");
			} else {
				logger.info("Test Failed");
			}

			// close Fire fox
			driver.close();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
			throw ex;
		}

	}

}
