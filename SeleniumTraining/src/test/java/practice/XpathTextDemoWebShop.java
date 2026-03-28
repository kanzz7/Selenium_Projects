package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(1000);
		for(WebElement r : radios) {
			Thread.sleep(1000);
			r.click();
		
		}

	}

}
