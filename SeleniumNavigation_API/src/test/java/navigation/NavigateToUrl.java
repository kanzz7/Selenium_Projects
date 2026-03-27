package navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
//more optimized

public class NavigateToUrl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to Amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//navigate to flipkart
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);
		
		//navigate to UberEats
		driver.navigate().to(new URL("https://www.ubereats.com/in"));
		
		

	}

}
