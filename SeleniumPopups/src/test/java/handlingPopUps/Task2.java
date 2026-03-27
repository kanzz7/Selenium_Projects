package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on search button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//handling the popup
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		//type 'Computers' in the search text field
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		//click on search button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		

	}

}
