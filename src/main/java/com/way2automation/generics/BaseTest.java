package com.way2automation.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant {
	public WebDriver driver;
	//WebDriverWait w = new WebDriverWait(driver, 10);

	@BeforeSuite
	public void start() {
		Reporter.log("excecution start", true);
	}

	@BeforeMethod
	public void openapp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeapp() {
		
		driver.quit();
	}

	@AfterSuite
	public void close() {
		Reporter.log("stop execution", true);
	}
}
