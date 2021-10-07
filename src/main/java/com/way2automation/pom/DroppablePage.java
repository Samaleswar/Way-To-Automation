package com.way2automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.generics.BasePage;

public class DroppablePage extends BasePage {

WebDriver driver;
	
	public DroppablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
