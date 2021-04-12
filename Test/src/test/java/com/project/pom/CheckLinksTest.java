package com.project.pom;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLinksTest {
	
	WebDriver driver;
	CheckLinksPage page;
	
		

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",".\\src\\Test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		page = new CheckLinksPage(driver);
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}
	@Test
	public void CheckLinks() {
		//assertTrue(page.checkLinksPage(),"Existen links invalidos");
	
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	
	}

}
