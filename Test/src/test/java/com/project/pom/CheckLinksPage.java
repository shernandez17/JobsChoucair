package com.project.pom;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckLinksPage extends Base{
	
	private WebDriver driver;
	
	public CheckLinksPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkLinksPage() {
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		String url = "";
		List<String> BadLinks = new ArrayList<String>();
		List<String> OkLinks = new ArrayList<String>();
		
		HttpURLConnection httpConection =null;
		int responseCode =200;
		Iterator <WebElement> it = Links.iterator();
		
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			if (url==null || url.isEmpty()) {
				System.out.println(url +"url está fallando, o está vacía" );
				continue;
			}
			try {
				httpConection = (HttpURLConnection)(new URL(url).openConnection());
				httpConection.setRequestMethod("HEAD");
				httpConection.connect();
				responseCode = httpConection.getResponseCode();
				
				if (responseCode>400) {
					System.out.println("ERROR, Link invalido: -- " + url);
					BadLinks.add(url);
					
				} else {
					System.out.println("Link valido: -- "+ url);
					OkLinks.add (url);
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		System.out.println("Links Validos "+OkLinks.size());
		System.out.println("Links invalidos "+BadLinks.size());
		
		if (BadLinks.size()>0) {
			System.out.println("LINKS INVALIDOS");
			for (int i = 0; i < BadLinks.size(); i++) {
				System.out.println(BadLinks.get(i));
			}
			
			return false;
		} else {
			return true;
		}
		
		
		
	}

}
