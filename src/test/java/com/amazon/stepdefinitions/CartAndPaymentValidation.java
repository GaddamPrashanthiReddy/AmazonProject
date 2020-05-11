package com.amazon.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.CartAndPaymentPage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.SignOutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartAndPaymentValidation {

	WebDriver driver;

	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}

	@Given("^Open the browser and enter the url of the website$")
	public void open_the_browser_and_enter_the_url_of_the_website() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		new LoginPage(driver).getUrl();
	}

	@When("^Click on Accounts and Lists$")
	public void click_on_Accounts_and_Lists() {
		new LoginPage(driver).signIn();
	}

	@Then("^User should navigate to SignIn Page$")
	public void user_should_navigate_to_SignIn_Page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User Set valid Emailid and click on continue$")
	public void user_Set_valid_Emailid_and_click_on_continue() throws Throwable {
		new LoginPage(driver).typeEmail();
		new LoginPage(driver).continueBtn();
	}

	@When("^Set valid password and checks for remember me$")
	public void set_valid_password_and_checks_for_remember_me1() throws Throwable {
		new LoginPage(driver).typePassword();
		new LoginPage(driver).rememberMe();
	}

	@When("^User click on login$")
	public void user_click_on_login() throws Throwable {
		new LoginPage(driver).login();
	}

	@Then("^User should navigate to Homepage$")
	public void user_should_navigate_to_Homepage() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@Given("^User on homepage and user click on Open Menu$")
	public void user_on_homepage_and_user_click_on_Open_Menu() {
		new CartAndPaymentPage(driver).openMenu();
	}

	@When("^Click on Beauty,Health,Grocery$")
	public void click_on_Beauty_Health_Grocery() {
		new CartAndPaymentPage(driver).groceriesClick();
	}

	@Then("^User click on Tea,coffee and beverages$")
	public void user_click_on_Tea_coffee_and_beverages() {
		new CartAndPaymentPage(driver).coffeeBeveragesClick();
	}

	@When("^User click on Tea and click on green tea$")
	public void user_click_on_Tea_and_click_on_green_tea() {
		new CartAndPaymentPage(driver).tea();
		new CartAndPaymentPage(driver).greenTea();
	}

	@When("^click on lipton green tea product$")
	public void click_on_lipton_green_tea_product() {
		new CartAndPaymentPage(driver).liptonGreenTea();
	}

	@When("^User click on Add to cart$")
	public void user_click_on_Add_to_cart() {
		new CartAndPaymentPage(driver).addToCart();
	}

	@Then("^User should navigate to Amazon shopping cart$")
	public void user_should_navigate_to_Amazon_shopping_cart() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User click on cart the product gets add to shopping cart$")
	public void user_click_on_cart_the_product_gets_add_to_shopping_cart() {
		new CartAndPaymentPage(driver).viewCart();
	}

	@When("^User click on Cart Icon$")
	public void user_click_on_Cart_Icon() {
		new CartAndPaymentPage(driver).cartIcon();
	}

	@Then("^User should navigate to the shopping cart page$")
	public void user_should_navigate_to_the_shopping_cart_page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User click on Proceed to buy$")
	public void user_click_on_Proceed_to_buy() {
		new CartAndPaymentPage(driver).proceedToBuy();
	}

	@Then("^User should navigates to delivery address page$")
	public void user_should_navigates_to_delivery_address_page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User click on deliver to this address$")
	public void user_click_on_deliver_to_this_address() {
		new CartAndPaymentPage(driver).deliverToThisAddress();
	}

	@Then("^User navigates to shipping delivery page$")
	public void user_navigates_to_shipping_delivery_page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

	@When("^User click on continue$")
	public void user_click_on_continue() {
		new CartAndPaymentPage(driver).continueButton();
	}

	@Then("^User should naviagte to payment method page$")
	public void user_should_naviagte_to_payment_method_page() throws Throwable {
		String title = new CartAndPaymentPage(driver).getTitle();
		System.out.println(title);
	}

}
