package com.git.cucumberdemo.stepDefs;

import org.springframework.beans.factory.annotation.Autowired;

import com.git.cucumberdemo.pageobjects.LoginPage;
import com.git.cucumberdemo.pageobjects.SearchPage;
import com.git.cucumberdemo.utils.DriverInitializer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Autowired
	LoginPage loginPage;
	@Autowired
	SearchPage searchPage;
	@Autowired
	DriverInitializer initdriver;
	
	@Before
	public void setup() {
		initdriver.getDriver();
	}
	
	@Given("Login page of the application")
	public void loginToApplication() {
		loginPage.navigate();
	}
	
	@When("Search the Selenium Text")
	public void searchSeleniumText() {
		searchPage.search();
	}
	
	@Then("Click on Search button")
	public void clickOnSearchButton() {
		searchPage.clickonSearch();
		loginPage.quitBrowser();
	}
	
}
