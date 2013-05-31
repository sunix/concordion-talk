package com.serli.demo.concordion.ext;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;
import org.concordion.ext.ScreenshotExtension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyExtension implements ConcordionExtension {

	// an embedded extension
	ScreenshotExtension ssextension = new ScreenshotExtension()
			.setScreenshotOnAssertionSuccess(true);

	public MyExtension setSeleniumDriver(FirefoxDriver driver) {
		ssextension.setScreenshotTaker(new SeleniumScreenshotTaker(driver));
		return this;
	}

	public void addTo(ConcordionExtender concordionExtender) {
		ssextension.addTo(concordionExtender);

		concordionExtender.withResource("/scripts/jquery-1.9.0.min.js",
				new Resource("/scripts/jquery-1.9.0.min.js"));
		concordionExtender.withResource("/scripts/Markdown.ClassConvert.js",
				new Resource("/scripts/Markdown.ClassConvert.js"));
		concordionExtender.withResource("/scripts/Markdown.Converter.js",
				new Resource("/scripts/Markdown.Converter.js"));
	}
}