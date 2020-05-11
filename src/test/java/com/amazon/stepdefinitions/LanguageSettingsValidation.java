package com.amazon.stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.CartAndPaymentPage;
import com.amazon.pom.LanguageSettingsPage;
import com.amazon.pom.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LanguageSettingsValidation {

	WebDriver driver;

	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}

	@Given("^Open browser and enter the Url of the website$")
	public void Open_browser_and_enter_the_Url_of_the_website() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		new LoginPage(driver).getUrl();
	}

	@When("^User click on language icon$")
	public void user_click_on_language_icon() throws Throwable {
		new LanguageSettingsPage(driver).languageIcon();
	}

	@Then("^User should navigate to Language Settings Page$")
	public void user_should_navigate_to_Language_Settings_Page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@Then("^click on radio button$")
	public void click_on_radio_button() throws Throwable {
		new LanguageSettingsPage(driver).radioButton();
	}

	@When("^User click on Savechanges$")
	public void user_click_on_Savechanges() throws Throwable {
		new LanguageSettingsPage(driver).saveChanges();
	}

	@Then("^User should navigate to Home page$")
	public void user_should_navigate_to_Home_page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@Then("^User click on Cancel$")
	public void user_click_on_Cancel() throws Throwable {
		new LanguageSettingsPage(driver).cancel();
	}

	@Then("^User should navigate to HomePage$")
	public void user_should_navigate_to_HomePage() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

}
