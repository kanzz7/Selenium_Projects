package assessments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SwagLab1 {
	
	@Test
	public void testMethod() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	//Navigate to    Swag Labs
     	driver.get("https://www.saucedemo.com/");
     	//Login with valid credentials
     	driver.findElement(By.id("user-name")).sendKeys("standard_user");
     	driver.findElement(By.id("password")).sendKeys("secret_sauce");
     	driver.findElement(By.id("login-button")).click();
     	Thread.sleep(2000);
     	
     	//Validate product page
     	String productPage = driver.findElement(By.xpath("//span[.='Products']")).getText();
     	if(productPage.contains("Products")) {
     		System.out.println("In product page");
     	}
     	else {
     		System.out.println("Not in product page");
     	}

     	//Add products to cart 
     	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
     	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
     	driver.findElement(By.id("shopping_cart_container")).click();
     	
     	//Verify cart items
     	WebElement idem1 = driver.findElement(By.linkText("Sauce Labs Backpack"));
     	if(idem1.getText().contains("Sauce Labs Backpack")) {
     		System.out.println("Item 1 is added");
     	}
     	else {
     		System.out.println("Item 1 is not added");
     	}
     	
     	WebElement idem2 = driver.findElement(By.linkText("Sauce Labs Bike Light"));
     	if(idem2.getText().contains("Sauce Labs Bike Light")) {
     		System.out.println("Item 2 is added");
     	}
     	else {
     		System.out.println("Item 2 is not added");
     	}
     	
     	//Perform checkout
     	driver.findElement(By.xpath("//button[.='Checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("James");
		driver.findElement(By.id("last-name")).sendKeys("Bond");
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();
		
		//Validate price Complete order
		String totalPrice = driver.findElement(By.cssSelector("[class='summary_total_label']")).getText();
		if(totalPrice.equals("Total: $43.18")) {
			System.out.println("Actual amount and expected amount are equal");
		}
		else {
			System.out.println("Actual amount and expected amount are not equal");
		}
		driver.findElement(By.xpath("//button[.='Finish']")).click();
		
		//Logout Close browser
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		

	}

}
