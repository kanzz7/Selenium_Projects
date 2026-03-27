package interrogationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//Fetching the 32 character unique session ID
		System.out.println(driver.getWindowHandle());
		//Refreshing the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.quit();
		

	}

}
