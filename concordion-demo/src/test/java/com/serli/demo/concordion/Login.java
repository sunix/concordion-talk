package com.serli.demo.concordion;

import org.concordion.api.extension.ConcordionExtension;
import org.concordion.api.extension.Extension;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.ScreenshotExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(ConcordionRunner.class)
public class Login {

	@Extension
	public ConcordionExtension extension = new ScreenshotExtension()
			.setScreenshotOnAssertionSuccess(true);

	private static FirefoxDriver driver;

	@BeforeClass
	public static void startDriver() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void stopDriver() {
		driver.quit();
	}

	private WebElement passwordField;

	public String accessAndFills(String url, String username, String password) {
		driver.get(url);
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys(username);
		passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(password);
		return "access and fills";
	}

	public String submits() {
		passwordField.submit();
		return "submits";
	}

	public String displayDomain() {
		return driver.getTitle();
	}
}
