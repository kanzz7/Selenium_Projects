package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment63 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase' and @type='button' and @onclick='submitLogin();return false;']")).click();
		Thread.sleep(2000);
		String title = "IceHrm";
		if(driver.getTitle().equals(title)) {
			System.out.println("In dashboard page");
		}
		else {
			System.out.println("Not in dashboard page");
		}
		driver.findElement(By.xpath("//span[text()='Employees']")).click();
		driver.findElement(By.partialLinkText(" Employees")).click();
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rc_select_5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='ant-select-item-option-content']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rc_select_8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='ant-select-item-option-content']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rc_select_10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("class=\"ant-select-item-option-content\"")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.partialLinkText("IceHrm")).click();
		driver.findElement(By.linkText("Sign out")).click();
		

	}

}
