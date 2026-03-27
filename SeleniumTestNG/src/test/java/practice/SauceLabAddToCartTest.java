package practice;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SauceLabAddToCartTest extends BaseClass{
//	@Test(priority = 0)
//	public void launchingBrowser() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--incognito");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}

//	@Test(priority = 1 ,dependsOnMethods = "launchingBrowser")
	@Test(priority = 1)
	public void login() {
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();

		// Verification

		WebElement swagLabsText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

		if (swagLabsText.getText().contains("Swag Labs")) {
			Reporter.log("Login Successful");
		} else {
			Reporter.log("Login Failed");
		}
	}

	@Test(priority = 2)
	public void addToCart() {
		// Adding to Cart
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
		String product1 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).getText();
		String product2 = driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']")).getText();
		// Verification
		System.out.println(product1);
		System.out.println(product2);
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> prductsInTheCart = driver.findElements(By.className("inventory_item_name"));
		System.out.println("-----------------------");
		boolean flag = true;

		for (WebElement i : prductsInTheCart) {
			System.out.println(i.getText());
			System.out.println("-----------------------");
			if (!(i.getText().contains(product1) || i.getText().contains(product2))) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Added to cart Succesfully");
		else
			System.out.println("Not Added to cart");

	}
}