package com.way2automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.generics.BasePage;

public class ReSizablePage extends BasePage {
	WebDriver driver;
	
	public ReSizablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
