package com.softtek.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

	@FindBy(linkText = "REGISTER")
	public WebElement registerLink;

}
