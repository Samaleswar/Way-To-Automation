package com.way2automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.generics.AutoConstant;
import com.way2automation.generics.BasePage;

public class DraggablePage extends BasePage implements AutoConstant {
	public WebDriver driver;

	@FindBy(id = "draggable")
	private WebElement draggable1;

	@FindBy(id = "draggable2")
	private WebElement draggable2;

	@FindBy(id = "draggable3")
	private WebElement draggable3;

	@FindBy(id = "draggable5")
	private WebElement draggable5;

	
	public DraggablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
