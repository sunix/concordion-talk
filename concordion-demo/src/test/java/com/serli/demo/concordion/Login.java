package com.serli.demo.concordion;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(ConcordionRunner.class)
public class Login {
	
	private static FirefoxDriver driver;

	@BeforeClass
	public static void startDriver(){
		driver = new FirefoxDriver();
	}
		
	@AfterClass
	public static void stopDriver(){
		driver.quit();
	}

	private WebElement passwordField;
	
	public String accessAndFills(){
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("Administrator");
		passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("Administrator");
		return "access and fills";
	}
	
	public String submits(){
		passwordField.submit();
		return "submits";
	}
	
	public String displayDomain(){
		return driver.getTitle();
	}
}
