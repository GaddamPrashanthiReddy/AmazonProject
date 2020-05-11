package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LanguageSettingsPage {

	WebDriver driver;

	public LanguageSettingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Using FindBy for locating elements

	@FindBy(how = How.XPATH, using = "//a[@class=\"nav-a nav-a-2 icp-link-style-2\"]")
	public WebElement languageBtn;

	@FindBy(xpath = "//span[@class=\"a-label a-radio-label\"]/span")
	public WebElement radioBtn;

	@FindBy(className = "a-button-input")
	public WebElement saveChangesBtn;

	@FindBy(id = "icp-btn-close-announce")
	public WebElement cancelBtn;

	// Defining all the user actions (Methods)

	public void languageIcon() {
		languageBtn.click();
	}

	public void radioButton() {
		radioBtn.click();
	}

	public void saveChanges() {
		saveChangesBtn.click();
	}

	public void cancel() {
		cancelBtn.click();
	}

}
