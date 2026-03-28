package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.generic_utility.ScreenshotUtility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

import seleniumUIFramework.OrangeHRM.DashboardPage;

public class CaptureScreenshot {
	@Test
	public void screenShot() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wu = new WebDriverUtility(driver);
		LoginPage lp = new LoginPage(driver);
		DashboardPage dsp = new DashboardPage(driver);
		ScreenshotUtility ssu = new ScreenshotUtility();
		
		String timestamp = new SimpleDateFormat("yyyy-mm-dd[hh-ss]").format(new Date());
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(4000);
		
		//Capture the screenshot of the Home page
		ssu.captureScreenshot(driver, "DashboardPage");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File permanent =new File("./Reports/dashboard.png");
//		FileHandler.copy(temp, permanent);
		
		//Capture the screenshot of the web element
		ssu.captureScreenshot(dsp.getRecruitment(), "recruitment");
//		WebElement recruitmentLink = dsp.getRecruitment();
//		File tempsrc = recruitmentLink.getScreenshotAs(OutputType.FILE);
//		File permTrg = new File("./Reports/recruitmentlink.png");
//		FileHandler.copy(tempsrc, permTrg);
		
	}

}
