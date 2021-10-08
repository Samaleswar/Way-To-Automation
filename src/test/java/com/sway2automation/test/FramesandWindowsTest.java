package com.sway2automation.test;

import org.testng.annotations.Test;

import com.way2automation.generics.BaseTest;
import com.way2automation.pom.FramesandWindowPage;
import com.way2automation.pom.HomePage;

public class FramesandWindowsTest extends BaseTest {

	@Test
	public void newwindow() {
		HomePage hp = new HomePage(driver);
		hp.clickOnFramesandWindows();
		
		hp.changeWindow();
		
		FramesandWindowPage fwp=new FramesandWindowPage(driver);
		fwp.switchToIFrame();
		fwp.clickNewbrowserTab();
		fwp.changeWindow();
		fwp.verifyText();
		
		
	}
}
