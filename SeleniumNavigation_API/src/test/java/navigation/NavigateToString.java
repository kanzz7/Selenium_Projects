package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //all the possible available web elements are visible
		
		//Navigating to Google
		driver.get("https://www.google.com/");  
		//driver.navigate().to("https://www.google.com/"); navigate() internally calling the get() method. so it also works as same like get(). but in get() method navigation back wont work 
		Thread.sleep(2000);
		
		//Navigate to YT
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//Navigate to wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
