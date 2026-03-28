package seleniumWaits;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(driver.getWindowHandle());
		for(String child : allWindowId) {
			driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Perfect song");
		
		

	}

}
}
