package handlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("//div[@data-index='3']")).click();
		Thread.sleep(4000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		allWindowId.remove(parentId);
		for(String childId : allWindowId) {
			driver.switchTo().window(childId);
		}
		driver.findElement(By.xpath("(//input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
