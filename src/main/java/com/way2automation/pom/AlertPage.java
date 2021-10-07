package com.way2automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2automation.generics.AutoConstant;
import com.way2automation.generics.BasePage;

public class AlertPage extends BasePage implements AutoConstant {
	WebDriver driver;
	String aText;

	@FindBy(xpath = "//iframe[@class='demo-frame']")
	private WebElement iframe;

	@FindBy(xpath = "//button[contains(text(),'Click the button to display an alert box:')]")
	private WebElement alertclick;

	public AlertPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void switchToIFrame() {
		driver.switchTo().frame(iframe);
	}

	public void acceptAlert() {
	//	alertclick.click();
		// aText=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	public void verifyAlertText() {
		alertclick.click();
		Assert.assertTrue(driver.switchTo().alert().getText().equalsIgnoreCase(AltText));
	}

}
