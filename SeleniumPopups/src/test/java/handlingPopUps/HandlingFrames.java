package handlingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
		
		//frame switching by index
		//driver.switchTo().frame(0);
		
		//frame switching 
		WebElement frame = driver.findElement(By.cssSelector(""));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("")).sendKeys("hello");

	}

}
