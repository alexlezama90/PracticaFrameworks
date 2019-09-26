package com.softtek.page.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.softtek.page.objects.RegisterPageObjects;

public class RegisterPageFunctions {
	private WebDriver driver;
	public RegisterPageObjects registerPageObjects;
	
	public RegisterPageFunctions(WebDriver driver) {
		this.driver = driver;
		registerPageObjects = 
				PageFactory.initElements(this.driver, RegisterPageObjects.class);
	}
	
	public boolean VerifyIsRegisterPage() {
		return driver.getTitle().equalsIgnoreCase("Register: Mercury Tours"); 
	}
	
	public void RegisterUserInfo(String ... registerInfo) {
		registerPageObjects.firstNameInput.sendKeys(registerInfo[0]);
		registerPageObjects.lastNameInput.sendKeys(registerInfo[1]);
		registerPageObjects.phoneInput.sendKeys(registerInfo[2]);
		registerPageObjects.userNameInput.sendKeys(registerInfo[3]);
		
		registerPageObjects.addressInput.sendKeys(registerInfo[4]);
		registerPageObjects.cityInput.sendKeys(registerInfo[5]);
		registerPageObjects.stateInput.sendKeys(registerInfo[6]);
		registerPageObjects.postalCodeInput.sendKeys(registerInfo[7]);
		registerPageObjects.countryInput.sendKeys(registerInfo[8]);

		registerPageObjects.emailInput.sendKeys(registerInfo[9]);
		registerPageObjects.passwordInput.sendKeys(registerInfo[10]);
		registerPageObjects.confirmPassword.sendKeys(registerInfo[10]);
		registerPageObjects.registerBtn.click();		
	}
	
	public boolean VerifyUserRegisteredProperly(String ... registerInfo) {
		boolean saludo = registerPageObjects.customSalute.getText().contains(registerInfo[0] + " " + registerInfo[1]);
		boolean nota = registerPageObjects.customNote.getText().contains(registerInfo[9]);
		
		return (saludo && nota);
	}
}
