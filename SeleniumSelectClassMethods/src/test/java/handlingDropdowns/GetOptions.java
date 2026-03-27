package handlingDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		Select sel = new Select(driver.findElement(By.id("options")));
		//Fetch all the available  in the dropdown
		List<WebElement> allOptions = sel.getOptions();
		for(WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		driver.quit();

	}

}
