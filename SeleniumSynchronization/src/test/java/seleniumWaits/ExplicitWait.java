package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/34");
		//writing the pin
		driver.findElement(By.id("Check Delivery")).sendKeys("212433");
		//locating the check button
		WebElement checkBtn = driver.findElement(By.id("Check"));
		//waiting for the check button to be neabled before clicking
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		//clicking on the check button 
		checkBtn.click();

	}

}
