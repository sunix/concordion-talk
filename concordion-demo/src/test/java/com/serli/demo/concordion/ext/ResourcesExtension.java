package com.serli.demo.concordion.ext;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class ResourcesExtension implements ConcordionExtension {

	public void addTo(ConcordionExtender concordionExtender) {
		concordionExtender.withResource("/scripts/jquery-1.9.0.min.js",
				new Resource("/scripts/jquery-1.9.0.min.js"));
		concordionExtender.withResource("/scripts/Markdown.ClassConvert.js",
				new Resource("/scripts/Markdown.ClassConvert.js"));
		concordionExtender.withResource("/scripts/Markdown.Converter.js",
				new Resource("/scripts/Markdown.Converter.js"));
	}
}