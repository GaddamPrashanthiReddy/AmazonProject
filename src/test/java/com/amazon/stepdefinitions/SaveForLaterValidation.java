package com.amazon.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.CartAndPaymentPage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.SignOutPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SaveForLaterValidation {

	WebDriver driver;

	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}

	@Given("^Open browser and enter the url of the website$")
	public void open_browser_and_enter_the_url_of_the_website() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		new LoginPage(driver).getUrl();
	}

	@When("^User click on Accounts and Lists$")
	public void user_click_on_Accounts_and_Lists() throws Throwable {
		new LoginPage(driver).signIn();
	}

	@Then("^User should navigate to Sign In Page$")
	public void user_should_navigate_to_Sign_In_Page() throws Throwable {
		String title = new LoginPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User enter valid Emailid and click on continue$")
	public void user_enter_valid_Emailid_and_click_on_continue() throws Throwable {
		new LoginPage(driver).typeEmail();
		new LoginPage(driver).continueBtn();
	}

	@When("^Enter valid password and checks for remember me$")
	public void enter_valid_password_and_checks_for_remember_me() throws Throwable {
		new LoginPage(driver).typePassword();
		// new LoginPage(driver).rememberMe();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		new LoginPage(driver).login();
	}

	@Then("^User should navigate to Home Page$")
	public void user_should_navigate_to_Home_Page() throws Throwable {
		String title = new LoginPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User click on cart icon$")
	public void user_click_on_cart_icon() throws Throwable {
		new CartAndPaymentPage(driver).cartIcon();
	}

	@Then("^User should navigate to Shopping cart page$")
	public void user_should_navigate_to_Shopping_cart_page() throws Throwable {
		String title = new LoginPage(driver).getTitle();
		System.out.println(title);

	}

	@When("^User Click on save for later$")
	public void user_Click_on_save_for_later() throws Throwable {
		new CartAndPaymentPage(driver).saveForLater();
	}

	@Then("^Product should move to save for later$")
	public void Product_should_move_to_save_for_later() throws Throwable {
		String title = new LoginPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^mouseHover and click on signout$")
	public void mousehover_and_click_on_signout() throws Throwable {
		new SignOutPage(driver).signOut();
	}

	@Then("^User should navigate to Sign In page$")
	public void user_should_navigate_to_Sign_In_page() throws Throwable {
		String title = new LoginPage(driver).getTitle();
		System.out.println(title);
	}
}
