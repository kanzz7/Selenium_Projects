package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		//s1 : Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//s2 : Navigate to webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//s3 : Enter username and password
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement homepage = driver.findElement(By.xpath("//h6"));
		if(homepage.isDisplayed()) {
			System.out.println("The home page is displayed : Status - PASS");
		}
		else {
			System.out.println("The home page is not displayed : Status - FAILED");
		}
		
		

	}

}
