package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//*[local-name()='svg' and @id='Layer_1']"));
		System.out.println(logo.getCssValue("font"));//it should be case-sensitive and the spelling should be correct otherwise it will give null.
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("background-color"));
		System.out.println(logo.getCssValue("display"));
		

	}

}
