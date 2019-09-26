package com.softtek.page.config;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.softtek.utils.ExcelUtils;

public class Setup {
	public static WebDriver driver;
	private Object[][] testObjArray;
	static String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
	static String driverConfig = "webdriver.chrome.driver";
	static String baseUrl = "http://newtours.demoaut.com/";
	static String testCaseWorkBook = System.getProperty("user.dir") + "/resources/FlightRegisterData.xlsx";
	static String testCaseWorkBook2 = System.getProperty("user.dir") + "/resources/FlightRegisterDat.xlsx";

	
	@DataProvider(name = "UserRegistration")
	public Object[][] usersToRegister () throws Exception{
		this.testObjArray = ExcelUtils.getTableArray(testCaseWorkBook, "RegisterUser");
		return (testObjArray);
	}
	
	@DataProvider(name = "UserRegistration2")
	public static Object[][] usersToRegister2 () throws FileNotFoundException {
		Object[][] testObjArray;
		try {
			testObjArray = ExcelUtils.getTableArray(testCaseWorkBook2, "RegisterUser");
			return (testObjArray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new FileNotFoundException();
		}
	}
	
	@BeforeSuite
	public static void setBrowser() {
		System.setProperty(driverConfig, chromePath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(baseUrl);		
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
