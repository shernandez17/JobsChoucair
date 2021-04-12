package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Search_test {
	
	private WebDriver driver;
	SearchPage searchjobs;

	@Before
	public void setUp() throws Exception {
		searchjobs = new SearchPage(driver);
		driver = searchjobs.chromeDriverConnection();
		searchjobs.get("https://www.choucairtesting.com/");
		searchjobs.manage();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		searchjobs.searchjobs();
				
	}

}
