package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Base {
	
	By empleosLinkLocator = By.linkText("Empleos");
	By keywordLinkLocator = By.id("search_keywords");
	By locationLinkLocator = By.id("search_location");
	By searchLinkLocator =By.name("Search Jobs");
	By submitLinkLocator = By.xpath("//input[@type='submit' and @value='Search Jobs']");

	
	public SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void searchjobs() {
		click(empleosLinkLocator);
		type("migracion", keywordLinkLocator);
		type("Medellin", locationLinkLocator);
		click(submitLinkLocator);

		
	}
	
	public String searchMessage() {
		return null;
	
	}

}
