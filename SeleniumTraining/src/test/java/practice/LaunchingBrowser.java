package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		//Launching chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigating to youtube
		driver.get("https://www.youtube.com/");
		
		//Fetching the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getTitle());
//		
//		WebDriver driver2 = new EdgeDriver();
//		
//		WebDriver driver3 = new FirefoxDriver();
		
//		String browser = "edge";
//		WebDriver driver = null; //to update the values we initialize. if we dont initialize it may take the previous value. to avoid conflict we initialize it.
//		if(browser.contains("chrome")) {
//			driver = new ChromeDriver(); //reinitialization
//		}
//		
//		else if(browser.contains("firefox")) {
//			driver = new FirefoxDriver();
//			
//		}
//		
//		else if(browser.contains("edge")) {
//			driver = new EdgeDriver();
//		}
//		
	

	}

}
