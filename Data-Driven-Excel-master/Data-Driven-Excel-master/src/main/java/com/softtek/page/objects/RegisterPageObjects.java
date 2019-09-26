package com.softtek.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageObjects {

	@FindBy(name = "firstName")
	public WebElement firstNameInput;
	
	@FindBy(name = "lastName")
	public WebElement lastNameInput;
	
	@FindBy(name = "phone")
	public WebElement phoneInput;
	
	@FindBy(id = "userName")
	public WebElement userNameInput;
	
	@FindBy(name = "address1")
	public WebElement addressInput;
	
	@FindBy(name = "city")
	public WebElement cityInput;
	
	@FindBy(name = "state")
	public WebElement stateInput;

	@FindBy(name = "postalCode")
	public WebElement postalCodeInput;
	
	@FindBy(name = "country")
	public WebElement countryInput;

	@FindBy(id = "email")
	public WebElement emailInput;

	@FindBy(name = "password")
	public WebElement passwordInput;

	@FindBy(name = "confirmPassword")
	public WebElement confirmPassword;

	@FindBy(name = "register")
	public WebElement registerBtn;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")
	public WebElement customSalute;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	public WebElement customNote;
	
	@FindBy(linkText = "Home")
	public WebElement homeLink;
}
