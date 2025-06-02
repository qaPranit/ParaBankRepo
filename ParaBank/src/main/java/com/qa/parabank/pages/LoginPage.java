package com.qa.parabank.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver ;



	//1. locators

	//2.  constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//3.pageaction
	public String getLoginPageTitle() {
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		return loginPageTitle;
	}




}
