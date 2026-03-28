package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("--Executing Suite and Connecting to DataBase--", true);
	}
	
	@BeforeTest
	public void brforeTest() {
		Reporter.log("--Executing System TestCase--", true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("--Executing AddToCartTest Class--", true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		Login with valid credentials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("--Executing AddToCartTest Class Methods--", true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("--Execution of AddToCartTest Class Methods Completed--", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("--Execution of AddToCartTest Class Completed--", true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("--Execution System TestCase Completed--", true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("--Execution of Suite is completed and disconnected the DB--", true);
	}

}
