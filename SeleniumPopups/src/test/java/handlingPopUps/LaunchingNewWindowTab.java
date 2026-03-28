package handlingPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewWindowTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		//Triggering a new tab in the same browser window and parallely switching the tool control to the new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://github.com/");

	}

}
