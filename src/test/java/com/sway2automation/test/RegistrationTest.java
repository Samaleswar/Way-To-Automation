package com.sway2automation.test;

import org.testng.annotations.Test;

import com.way2automation.generics.BaseTest;
import com.way2automation.pom.HomePage;
import com.way2automation.pom.RegistrationPage;

public class RegistrationTest extends BaseTest {

	@Test
	public void RegTests() {
		HomePage hp = new HomePage(driver);
		hp.clickOnRegistration();
		hp.changeWindow();

		RegistrationPage rp = new RegistrationPage(driver);
		rp.registrationformsubmit();

	}

}
