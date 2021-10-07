package com.way2automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.generics.AutoConstant;
import com.way2automation.generics.BasePage;
import com.way2automation.generics.BaseTest;

public class RegistrationPage extends BaseTest implements AutoConstant {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset/p[1]/input")
	private WebElement firstname;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset/p[2]/input")
	private WebElement lastname;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[2]/div/label[1]/input")
	private WebElement Single;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[2]/div/label[2]/input")
	private WebElement Married;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[2]/div/label[3]/input")
	private WebElement Divorced;

	@FindBy(xpath = "//fieldset[@class='fieldset padding-bottom']/div/label[1]")
	private WebElement Dance;

	@FindBy(xpath = "//fieldset[@class='fieldset padding-bottom']/div/label[2]")
	private WebElement Reading;

	@FindBy(xpath = "//fieldset[@class='fieldset padding-bottom']/div/label[3]")
	private WebElement Cricket;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[4]/select")
	private WebElement countryDropdown;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[5]/div[1]")
	private WebElement monthdropdown;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[5]/div[2]")
	private WebElement daydropdown;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[5]/div[3]")
	private WebElement yeardropdown;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[6]/input")
	private WebElement phonenumber;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[7]/input")
	private WebElement username;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[8]/input")
	private WebElement email;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[10]/textarea")
	private WebElement aboutfield;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[11]/input")
	private WebElement password;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[12]/input")
	private WebElement confirmpassword;

	@FindBy(xpath = "//div[@class='registration_form']/form/fieldset[13]/input")
	private WebElement submitBtn;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void registrationformsubmit() {
		firstname.sendKeys(Firstname);
		lastname.sendKeys(Lastname);
		Single.click();
		Married.click();
		Divorced.click();
		Dance.click();
		Reading.click();
		Cricket.click();
		phonenumber.sendKeys(Phone);
		username.sendKeys(Username);
		email.sendKeys(Email);
		aboutfield.sendKeys(About);
		password.sendKeys(Password);
		confirmpassword.sendKeys(Password);
		submitBtn.click();
		//driver.close();
	}

}
