package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumuiframework.generic_utility.FileUtility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login test");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverUtility wu =new WebDriverUtility(driver);
		FileUtility fu = new FileUtility();
		LoginPage lp = new LoginPage(driver);
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pass = fu.getPropertyKeyValue("password");

		wu.navigateToApplication(urlPath);
		//test.log(Status.INFO, "Navigate to OrangeHRM login page"); or
		test.info("Navigate to OrangeHRM login page");
		lp.login(un, pass);
		//test.log(Status.PASS,"Login successful"); or
		test.pass("Login successful");
		
		extent.flush();
		
	}

}
