package com.qa.parabank.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		 if(browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
		 }
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 return driver;
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
