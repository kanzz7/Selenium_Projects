package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(20000);
		WebElement checkbt = driver.findElement(By.id("Check"));
		//Verifying if the button is enabled
		System.out.println("Is my check button is enabled : "+checkbt.isEnabled());

	}

}
