package com.orangehrm.seleniumuiframework.generic_utility;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

import seleniumUIFramework.OrangeHRM.DashboardPage;

@Listeners(com.orangehrm.seleniumuiframework.generic_utility.ListenersImplementation.class) //packagename.classname.class
public class BaseClass {
	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	FileUtility fiu = new FileUtility();
	WebDriverUtility wdu;
	LoginPage lp;
    public DashboardPage dsp;
	public String browser;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("--Executing BeforeSuite--",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Executing BeforeTest",true);
	}
	
	@Parameters("BROWSER") //parallel execution across different browsers
	@BeforeClass(groups = {"Regression","Smoke"})
	public void beforeClass() throws IOException {
		Reporter.log("--Launching the Browser--",true);
		
		browser = fiu.getPropertyKeyValue("browser");
		if(browser.contains("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			driver = new FirefoxDriver();
		}
		else  {
			driver = new EdgeDriver();
		}
		
		wdu = new WebDriverUtility(driver);
		lp = new LoginPage(driver);
		dsp = new DashboardPage(driver);
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(30);

	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		Reporter.log("--Navigating to the application and logging in--",true);
		fis = new FileInputStream("./src/test/resources/OrangeHRM_CommonData/commondata.properties");  //.-> go to my current repository
		prop = new Properties();
		prop.load(fis);
		
//		prop.load(fis); //to let understand the compiler which is key and which is value
//		String URL = prop.getProperty("url");
		String uRL = fiu.getPropertyKeyValue("url");
		String validUserName = fiu.getPropertyKeyValue("username");
		String validPassword = fiu.getPropertyKeyValue("password");
		
		//login
		wdu.navigateToApplication(uRL);
	    LoginPage lp = new LoginPage(driver);
		lp.login(validUserName, validPassword);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logging out",true);
		dsp.logout();
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("Executing AfterClass",true);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Executing AfterTest",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Executing AfterSuite",true);
	}
	

}
