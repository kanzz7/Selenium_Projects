package handlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//Clicking on view more of laptops
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		//switching the tool control to child window to perform on its web element
		String parentID = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentID);
		for(String childId : allWindowId) {
			//Switching the tool control to the child window popup
			driver.switchTo().window(childId);
		}
		//click on add to cart in child window
		WebElement addToCart = driver.findElement(By.tagName("button"));
		addToCart.click();
		addToCart.click();
		Thread.sleep(2000);
		WebElement cartLogo = driver.findElement(By.xpath("//*[local-name() = 'svg']"));
		cartLogo.click();
		Thread.sleep(2000);
		//verifying if the shopping list is visible
		WebElement shoppingCartList = driver.findElement(By.tagName("h2"));
		if(shoppingCartList.isDisplayed()) {
			System.out.println("Test case status : Pass");
		}
		else {
			System.out.println("Test case status : Fail");
		}
		driver.close();

	}

}
