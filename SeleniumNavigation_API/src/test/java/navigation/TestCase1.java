package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Automation");
		Thread.sleep(2000);
		//navigate to amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tools");
		Thread.sleep(2000);
		//Refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		//navigate back 
		driver.navigate().back();
		//verify the title
		System.out.println(driver.getTitle());

	}

}
