package com.qa.parabank.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.parabank.factory.DriverFactory;
import com.qa.parabank.pages.LoginPage;

public class BaseTest {
	public WebDriver driver;
	public DriverFactory df;
	public LoginPage loginPage;
	

	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		driver  = df.initDriver("chrome");
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}



}
