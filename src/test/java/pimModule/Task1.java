package pimModule;

import java.awt.dnd.DragGestureEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class Task1 {
	
	@Test
	public void testMethod() throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//Login with valid credentials
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	
	//Click on PIM link
	driver.findElement(By.xpath("//span[.='PIM']")).click();
	
	//click on +Add button
	driver.findElement(By.xpath("//button[.=' Add ']")).click();
	
	//enter firstname
	driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("James");
	
	//enter middlename
	driver.findElement(By.cssSelector("[name='middleName']")).sendKeys("Bond");
	
	//enter lastname
	WebElement lastname = driver.findElement(By.cssSelector("[name='lastName']"));
	lastname.sendKeys("JK");
	
	//enter employeeId
	WebElement employeeId = driver.findElement(RelativeLocator.with(By.tagName("input")).below(lastname));
	employeeId.sendKeys("12345");
	
	//click on Create Login Details toggle button
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
	
	//enter username
	driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @autocomplete='off']")).sendKeys("james");
	
	//password and confirm password
	WebElement password = driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @type=\"password\"]"));
	password.sendKeys("Orange@123");
	Thread.sleep(2000);
	WebElement enableRadioBtn = driver.findElement(By.xpath("//label[.='Enabled']"));
	driver.findElement(RelativeLocator.with(By.tagName("input")).below(enableRadioBtn)).sendKeys("Orange@123");
	Thread.sleep(2000);
	//driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(password)).sendKeys("Orange@123");
	
	//click on save button
	driver.findElement(By.cssSelector("[type='submit']")).click();
	
	//click on Admin 
	driver.findElement(By.xpath("//span[.='Admin']")).click();
	
	//verify whether the employee is added from the records found section and logout
	
	//Enter Username to verify
	WebElement un = driver.findElement(By.xpath("//label[.='Username']"));
	WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).below(un));
	username.sendKeys("james");
	
	//Enter Userrole to verify
	driver.findElement(By.xpath("//div[.='-- Select --' and @tabindex='0']")).click();
	driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
	driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("James Bond JK");
	driver.findElement(By.xpath("//div[@role='option']//span[text()='James Bond JK']")).click();
	WebElement stat = driver.findElement(By.xpath("//label[.='Status']"));
	WebElement status = driver.findElement(RelativeLocator.with(By.tagName("div")).below(stat));
	status.click();
	driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']")).click();
	driver.findElement(By.xpath("//button[.=' Search ']")).click();
	
	

	
	
	
	
	
	
	
	
	}
}
