package com.way2automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.way2automation.generics.AutoConstant;
import com.way2automation.generics.BasePage;

public class DropdownPage extends BasePage implements AutoConstant {

	WebDriver driver;

	@FindBy(xpath = "//iframe[@class='demo-frame']")
	private WebElement iframe;

	@FindBy(xpath = "//select")
	private WebElement dropdown1;

	public DropdownPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void switchToIFrame() {
		driver.switchTo().frame(iframe);
	}

	public void selectdropdown() {
		dropdown1.click();
		Select dropdown = new Select(dropdown1);
		dropdown.selectByValue("India");

	}
}
