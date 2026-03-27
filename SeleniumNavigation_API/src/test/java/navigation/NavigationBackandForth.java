package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBackandForth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//navigate to Mynthra
		driver.get("https://mynthra.com/");
		Thread.sleep(2000);
		
		//navigate to BigBasket
		driver.navigate().to("https://www.bigbasket.com/");
		
		//navigate to Ajio
		driver.navigate().to("https://www.ajio.com/");
		Thread.sleep(2000);
		
		//navigate to BigBasket and verifying
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//navigating to Ajio and verifying
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		
		

	}

}
