package com.way2automation.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.generics.AutoConstant;
import com.way2automation.generics.BasePage;

public class HomePage extends BasePage implements AutoConstant {
	public WebDriver driver;

	@FindBy(xpath = "//h2[contains(text(),'Draggable')]")
	private WebElement DraggableBtn;

	@FindBy(xpath = "//h2[contains(text(),'Droppable')]")
	private WebElement DroppableBtn;

	@FindBy(xpath = "//h2[contains(text(),'Resizable')]")
	private WebElement ResizableBtn;

	@FindBy(xpath = "//h2[contains(text(),'Selectable')]")
	private WebElement SelectableBtn;

	@FindBy(xpath = "//h2[contains(text(),'Sortable')]")
	private WebElement SortableBtn;

	//@FindBy(xpath = "//h2[contains(text(),'Alert')]")
	@FindBy(xpath="//img[@alt='alert']")
	private WebElement AlertBtn;

	@FindBy(xpath = "//h2[contains(text(),'Registration')]")
	private WebElement RegistrationBtn;
	
	@FindBy(xpath="//img[@alt='dropdown']")
	private WebElement DropDownPage;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnDraggable() {
		DraggableBtn.click();
	}

	public void clickOnDroppable() {
		DroppableBtn.click();
	}

	public void clickOnResizable() {
		ResizableBtn.click();
	}

	public void clickOnSelectable() {
		SelectableBtn.click();
	}

	public void clickOnSortable() {
		SortableBtn.click();
	}

	public void clickOnAlert() {
		
		AlertBtn.click();
	}

	public void clickOnRegistration() {
		RegistrationBtn.click();
	}
	
	public void dropdownPage() {
		DropDownPage.click();
	}

	public void changeWindow() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

	}

}
