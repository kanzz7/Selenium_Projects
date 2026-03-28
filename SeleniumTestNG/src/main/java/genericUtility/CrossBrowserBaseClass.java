package genericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserBaseClass {
	
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("--Executing Suite and Connecting to DataBase--", true);
	}
	
	@BeforeTest
	public void brforeTest() {
		Reporter.log("--Executing System TestCase--", true);
	}
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--incognito");
		copt.addArguments("--headless");
		
		EdgeOptions eopt = new EdgeOptions();
		eopt.addArguments("--inprivate");
		eopt.addArguments("--headless");
		
		FirefoxOptions fopt = new FirefoxOptions();
		fopt.addArguments("--headless=new");
		fopt.addArguments("--headless");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(copt);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(fopt);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(eopt);
		}
		else {
			System.out.println("--Give proper browser to launch--");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@Test
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
