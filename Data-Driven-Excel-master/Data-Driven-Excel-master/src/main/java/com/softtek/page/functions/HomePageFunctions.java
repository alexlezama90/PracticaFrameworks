package com.softtek.page.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.softtek.page.objects.HomePageObjects;

public class HomePageFunctions {
	private WebDriver driver;
	public HomePageObjects homePageObjects;
	
	public HomePageFunctions(WebDriver driver) {
		this.driver = driver;
		homePageObjects = 
				PageFactory.initElements(this.driver, HomePageObjects.class);
	}
	
	public boolean VerifyIsHomePage() {
		return driver.getTitle().equalsIgnoreCase("Welcome: Mercury Tours");
	}
	
	public void NavigateToRegisterPage() {
		homePageObjects.registerLink.click();
	}
}
