package com.sway2automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.way2automation.generics.AutoConstant;
import com.way2automation.generics.BaseTest;
import com.way2automation.pom.AlertPage;
import com.way2automation.pom.HomePage;

public class AlertTest extends BaseTest implements AutoConstant {

	@Test
	public void checkAlert() {
		HomePage hp = new HomePage(driver);
		hp.clickOnAlert();

		hp.changeWindow();

		AlertPage ap = new AlertPage(driver);
		ap.switchToIFrame();
		ap.verifyAlertText();
		ap.acceptAlert();
	}

}
