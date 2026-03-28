package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//clicking on fb 
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(6000);
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
