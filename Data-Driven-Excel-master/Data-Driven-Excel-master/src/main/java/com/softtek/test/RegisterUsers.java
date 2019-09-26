package com.softtek.test;

import com.softtek.page.config.Setup;
import com.softtek.page.functions.HomePageFunctions;
import com.softtek.page.functions.RegisterPageFunctions;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterUsers extends Setup {
	String xpathLoc = ".//*[contains(text(),'Note: Your user name is')]";
	
	
	@Test(priority = 0, dataProvider = "UserRegistration", description = "Test Case for Register an user")
	public void registerUserInformation(String... registerInfo) {
		HomePageFunctions homePageFunctions = new HomePageFunctions(driver);
		RegisterPageFunctions registerPageFunctions = new RegisterPageFunctions(driver);

		Assert.assertTrue(homePageFunctions.VerifyIsHomePage());

		homePageFunctions.NavigateToRegisterPage();

		Assert.assertTrue(registerPageFunctions.VerifyIsRegisterPage());

		registerPageFunctions.RegisterUserInfo(registerInfo);

		Assert.assertTrue(registerPageFunctions.VerifyUserRegisteredProperly(registerInfo));

		registerPageFunctions.registerPageObjects.homeLink.click();

	}

	@Test(description = "Test Case No Excel File Found")
	public void noDBError() throws Exception {
		
		Assert.assertThrows(FileNotFoundException.class, () -> Setup.usersToRegister2());
		
//		HomePageFunctions homePageFunctions = new HomePageFunctions(driver);
//		RegisterPageFunctions registerPageFunctions = new RegisterPageFunctions(driver);
//
//		Assert.assertTrue(homePageFunctions.VerifyIsHomePage());
//
//		homePageFunctions.NavigateToRegisterPage();
//
//		Assert.assertTrue(registerPageFunctions.VerifyIsRegisterPage());
//
//		registerPageFunctions.RegisterUserInfo(registerInfo);
//
//		Assert.assertTrue(registerPageFunctions.VerifyUserRegisteredProperly(registerInfo));
//
//		registerPageFunctions.registerPageObjects.homeLink.click();
	}

}
