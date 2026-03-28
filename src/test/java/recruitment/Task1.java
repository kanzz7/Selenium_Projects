package recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {

	
		@Test
		public void recruitmentModule() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			//Login with valid credentials
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
			driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector("[type='submit']")).click();
			
			//click on Recruitment link
			driver.findElement(By.xpath("//span[.='Recruitment']")).click();
			
			driver.findElement(By.xpath("//button[.=' Add ']")).click();
			
			driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("James");
			
			driver.findElement(By.cssSelector("[name='middleName']")).sendKeys("Bond");
			
			driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("JK");
			
			driver.findElement(By.xpath("//label[.='Vacancy']/../..//div[2]")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	


}
