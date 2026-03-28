package relativelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ToRightOf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("Computers");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search)).click();

	}

}
