package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMSoftAssert {
	@Test
	public void TestMethod() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//Login with valid credentials
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	
	String expectedTitle = "OrangeHRM";
	String actualTitle = driver.getTitle();
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(actualTitle, expectedTitle);
//	sa.assertAll();

	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Status : Pass");
	}
	else {
		System.out.println("Status : Fail");
	}
	
	sa.assertAll();
	}

}
