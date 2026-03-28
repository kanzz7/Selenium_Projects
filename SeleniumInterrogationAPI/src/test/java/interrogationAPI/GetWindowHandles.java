package interrogationAPI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//Fetching the window ID of parent window
		String parentID = driver.getWindowHandle();
		System.out.println("This is the Window ID of Paremt Window : "+parentID);
		//Click on a tab to get Child window popup
		driver.findElement(By.xpath("//h2['Watches']/..//button")).click();
		Thread.sleep(2000);
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println("Window Ids of Both Parent and Child windows"+allWindowId);
		//Removing parent ID from all windowId
		allWindowId.remove(parentID);
		//Child id is still in set<String>
		System.out.println(allWindowId);
		//Fetching the Child ID out of the collection(Set)
		for(String string : allWindowId) {
			System.out.println("Window ID of Child Window : "+string);
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}
