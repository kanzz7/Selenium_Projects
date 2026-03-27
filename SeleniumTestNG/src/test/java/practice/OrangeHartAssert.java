package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHartAssert {
	
	@Test
	public void TestMethod() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//Login with valid credentials
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	
	String expectedTitle = "OrangeHRMM";
	String actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Status : Passed");
	}
	else {
		System.out.println("Status : Failed");
	}
	
	

	}

}
