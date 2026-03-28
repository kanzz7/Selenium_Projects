package handlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement oldStyle = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(oldStyle);
		System.out.println("Old Style Select Menu : "+sel.isMultiple());
		Thread.sleep(2000);
		
		

	}

}
