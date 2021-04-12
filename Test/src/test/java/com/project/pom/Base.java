package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	public void base(WebDriver driver) {
		this.driver =driver;
	}
	
		public WebDriver chromeDriverConnection() {
			System.setProperty("webdriver.chrome.driver",".\\src\\Test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}
	
		public WebElement findElement(By locator) {
			return driver.findElement(locator);
				
		}
		public List<WebElement> findElements (By locator){
			return driver.findElements(locator);
		}
		
		public String getText(WebElement element) {
			return element.getText();
		}
		public String getText(By locator) {
			return driver.findElement(locator).getText();
		}
		public void type (String inputText, By locator) {
			driver.findElement(locator).sendKeys(inputText);
		}
		public void click (By locator) {
			driver.findElement(locator).click();
		}
		public void get (String url) {
			driver.get(url);
		}
		public void manage () {
			driver.manage().window().maximize();
		}
		
}
