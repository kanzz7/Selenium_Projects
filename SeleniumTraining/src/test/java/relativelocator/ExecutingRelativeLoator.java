package relativelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExecutingRelativeLoator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement firstNameTF = driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstNameTF.sendKeys("Kanimozhi");
		WebElement lastNameTF = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstNameTF));
		lastNameTF.sendKeys("T");
		WebElement address = driver.findElement(RelativeLocator.with(By.cssSelector("ng-model='Adress']")).below(lastNameTF));
		address.sendKeys("No.1, Anna Nagar");
		
		

	}

}
