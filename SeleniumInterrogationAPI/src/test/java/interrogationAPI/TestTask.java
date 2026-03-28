package interrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'username')]"));
		username.sendKeys("Admin");
		WebElement pw = driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
		
	}

}
