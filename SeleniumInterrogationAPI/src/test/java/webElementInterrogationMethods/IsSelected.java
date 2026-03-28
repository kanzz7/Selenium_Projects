package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.id("pollanswers-2"));
		System.out.println("Is the good button selected : "+radio.isSelected());
		radio.click();
		System.out.println("Is the good button selected : "+radio.isSelected());
		driver.quit();

	}

}
