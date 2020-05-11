package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartAndPaymentPage {

	WebDriver driver;

	public CartAndPaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Using FindBy for locating elements

	@FindBy(how = How.ID, using = "nav-hamburger-menu")
	private WebElement menu;

	@FindBy(how = How.XPATH, using = "//a[@data-menu-id=\"12\"]/..")
	private WebElement groceries;

	@FindBy(how = How.XPATH, using = "//a[text()='Coffee, Tea & Beverages']/..")
	private WebElement coffeeBeverages;

	@FindBy(how = How.XPATH, using = "//img[@alt=\"Tea\"]")
	private WebElement tea;

	@FindBy(how = How.XPATH, using = "//span[text()='Green Tea']")
	private WebElement greenTea;

	@FindBy(how = How.XPATH, using = "//h2[@class=\"a-size-base s-inline s-access-title a-text-normal\"]")
	private WebElement liptonGreenTea;

	@FindBy(how = How.ID, using = "add-to-cart-button")
	private WebElement addToCart;

	@FindBy(how = How.XPATH, using = "//span[@class='a-button-inner']/..")
	private WebElement cart;

	@FindBy(how = How.ID, using = "nav-cart")
	private WebElement cartIcon;

	@FindBy(how = How.ID, using = "sc-buy-box-ptc-button")
	private WebElement proceedToBuy;

	@FindBy(how = How.XPATH, using = "//a[@data-action='page-spinner-show']")
	private WebElement deliverToThisAddress;

	@FindBy(how = How.XPATH, using = "//input[@value=\"Continue\"]/..")
	private WebElement continueButton;

	@FindBy(how = How.XPATH, using = "//input[@value=\"instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false\"]")
	private WebElement radioBtn;

	@FindBy(how = How.XPATH, using = "//span[@aria-owns=\"2_dropdown_combobox\"]/..")
	private WebElement dropDown;

	@FindBy(how = How.XPATH, using = "//a[@data-value=\"SBI DIRECT\"]/..")
	private WebElement sbi;

	@FindBy(how = How.XPATH, using = "//input[@class=\"a-button-input a-button-text\"]/..")
	private WebElement continueBtn;

	@FindBy(how = How.XPATH, using = "//input[@value=\"Save for later\"]")
	private WebElement saveForLater;

	// Defining all the user actions (Methods)

	public void openMenu() {
		menu.click();
	}

	public void groceriesClick() {
		groceries.click();
	}

	public void coffeeBeveragesClick() {
		coffeeBeverages.click();
	}

	public void tea() {
		tea.click();
	}

	public void greenTea() {
		greenTea.click();
	}

	public void liptonGreenTea() {
		liptonGreenTea.click();
	}

	public void addToCart() {
		addToCart.click();
	}

	public void viewCart() {
		cart.click();
	}

	public void cartIcon() {
		cartIcon.click();
	}

	public void proceedToBuy() {
		proceedToBuy.click();
	}

	public void deliverToThisAddress() {
		deliverToThisAddress.click();
	}

	public void continueButton() {
		continueButton.click();
	}

	public void radioButton() {
		radioBtn.click();
	}

	public void dropDown() {
		dropDown.click();
	}

	public void sbiOption() {
		sbi.click();
	}

	public void saveForLater() {
		saveForLater.click();
	}

	public String getTitle() throws Exception {
		Thread.sleep(3000);
		return driver.getTitle();
	}

}
