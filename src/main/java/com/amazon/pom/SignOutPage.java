package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {

	WebDriver driver;

	public SignOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Using Findby for locating elements

	@FindBy(how = How.XPATH, using = "//a[@data-nav-role=\"signin\"]")
	private WebElement mouseHover;

	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	private WebElement signOut;

	// Using FindBy for locating elements

	// This method is used for performing mousehover and click on signout link
	public void signOut() {
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover);
		action.build().perform();
		signOut.click();
	}

}
