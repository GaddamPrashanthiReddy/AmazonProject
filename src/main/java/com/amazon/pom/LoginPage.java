package com.amazon.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.excel.ExcelData;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Using FindBy for locating elements

	@FindBy(id = "nav-link-accountList")
	private WebElement Accountandlistsbtn;

	@FindBy(xpath = "//span[@class=\"nav-action-inner\"]/..")
	private WebElement signIn;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement typeEmail;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	@FindBy(name = "password")
	private WebElement typePassword;

	@FindBy(name = "rememberMe")
	private WebElement checkrememberMe;

	@FindBy(id = "signInSubmit")
	private WebElement loginbtn;

	// Defining all the user actions (Methods)

	// This method is used to enter url
	public void getUrl() throws IOException {
		String url = ExcelData.read(1, 0);
		driver.get(url);
	}

	// This method is used to click on SignIn
	public void signIn() {
		Actions action = new Actions(driver);
		action.moveToElement(Accountandlistsbtn);
		action.build().perform();
		signIn.click();
	}

	// This method is to set Email in the email text box

	public void typeEmail() throws IOException {
		String EmailId = ExcelData.read(1, 1);
		typeEmail.sendKeys(EmailId);
	}

	public void login() {
		loginbtn.click();
	}

	public void continueBtn() {
		continuebtn.click();
	}
	// This method is to set Password in the password text box

	public void typePassword() throws IOException {
		String password = ExcelData.read(1, 2);
		typePassword.sendKeys(password);
	}

	public void rememberMe() {
		checkrememberMe.click();
	}

	// This method is to close browser
	public void close() {
		driver.close();
	}

	public String getTitle() throws Exception {
		Thread.sleep(3000);
		return driver.getTitle();
	}

}
