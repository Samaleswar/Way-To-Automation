package com.way2automation.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2automation.generics.BaseTest;

public class FramesandWindowPage extends BaseTest {
	WebDriver driver;

	@FindBy(xpath = "//iframe[@class='demo-frame']")
	private WebElement iframe;

	@FindBy(xpath = "//div[@class=\"farme_window\"]/p/a")
	private WebElement newbrowsertab;

	@FindBy(xpath = "//div[@class='farme_window']/p/a")
	private WebElement text;

	public void changeWindow() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		String child2 = it.next();
		driver.switchTo().window(child2);

	}

	public void clickNewbrowserTab() {
		newbrowsertab.click();

	}

	public void verifyText() {
		Assert.assertTrue(text.getText().contentEquals("New Browser Tab"));

	}

	public void switchToIFrame() {
		driver.switchTo().frame(iframe);
	}

	public FramesandWindowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
