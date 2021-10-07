package com.sway2automation.test;

import org.testng.annotations.Test;

import com.way2automation.generics.BaseTest;
import com.way2automation.pom.DropdownPage;
import com.way2automation.pom.HomePage;

public class DropdownTest extends BaseTest {

	@Test
	public void dropdown() {
		HomePage hp = new HomePage(driver);
		hp.dropdownPage();

		hp.changeWindow();

		DropdownPage dp = new DropdownPage(driver);
		dp.switchToIFrame();
		dp.selectdropdown();
	}
}
