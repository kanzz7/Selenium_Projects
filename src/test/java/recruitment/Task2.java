package recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class Task2 {
	
	@Test
	public void recruitmentModule() throws InterruptedException {
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
		Thread.sleep(2000);
		//click on vacancies link
		driver.findElement(By.xpath("//a[.='Vacancies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' Add ']")).click();
		Thread.sleep(2000);
		//enter vacancy name
		driver.findElement(By.xpath("//label[.='Vacancy Name']/../..//div[2]//input")).sendKeys("Software engineer");
		Thread.sleep(2000);
		
		
		//select job title
		driver.findElement(By.xpath("//label[.='Job Title']/../..//div[2]")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Software Engineer']")).click();
		Thread.sleep(2000);
		
		//add description
		driver.findElement(By.cssSelector("[placeholder='Type description here']")).sendKeys("Vacancy for software engineer");
		Thread.sleep(2000);
		
		//select hiring manager
		driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("Krish");
		Thread.sleep(2000);
		
		//number of positions
		driver.findElement(By.xpath("//label[.='Number of Positions']/../..//div[2]//input")).sendKeys("3");
		Thread.sleep(2000);
		
		//click on save button 
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}

}
