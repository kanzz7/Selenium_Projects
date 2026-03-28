package assessments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SwagLabs2 {
	
	@Test
	public void testMethod() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	
     	//Navigate to Swag Labs  
     	driver.get("https://www.saucedemo.com/");
     	driver.findElement(By.id("user-name")).sendKeys("standard_user");
     	driver.findElement(By.id("password")).sendKeys("secret_sauce");
     	//Login to Application
     	driver.findElement(By.id("login-button")).click();
     	Thread.sleep(2000);
     	
     	//Sort Products by Price (Low to High)
     	driver.findElement(By.cssSelector("[class='product_sort_container']")).click();
     	driver.findElement(By.xpath("//option[.='Price (low to high)']")).click();
  
     	//Add Lowest Price Product to Cart
     	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
     	Thread.sleep(2000);
     	
     	driver.findElement(By.id("shopping_cart_container")).click();
     	
     	//Add Lowest Price Product to Cart
     	WebElement product = driver.findElement(By.linkText("Sauce Labs Onesie"));
     	if(product.getText().contains("Sauce Labs Onesie")) {
     		System.out.println("Product is added");
     	}
     	else {
     		System.out.println("Product is not added");
     	}
     	
     	//Proceed to Checkout
     	driver.findElement(By.xpath("//button[.='Checkout']")).click();
     	
     	Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("James");
		driver.findElement(By.id("last-name")).sendKeys("Bond");
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();
		
		//Verify Order Summary
		WebElement summary = driver.findElement(By.linkText("Sauce Labs Onesie"));
     	if(summary.getText().equals("Sauce Labs Onesie")) {
     		System.out.println("The expected product is ordered successfully");
     	}
     	else {
     		System.out.println("The expected product is not ordered correctly");
     	}
     	
     	//Complete Order
     	driver.findElement(By.xpath("//button[.='Finish']")).click();
     	
     	//Logout
     	driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}

}
