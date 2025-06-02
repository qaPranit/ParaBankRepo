package com.qa.parabank.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.parabank.base.BaseTest;

public class LoginPageTest extends BaseTest{

	@Test
	public void getLoginPageTitle() {
		String loginPageTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "ParaBank | Welcome | Online Banking");


	}
}
