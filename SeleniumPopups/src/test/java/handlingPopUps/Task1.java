package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Dresses");
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Dresses")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//img[@title='Claura Women Floral Printed  Fit & Flare Midi Dress']")).click();
	    Thread.sleep(4000);
	    String parent = driver.getWindowHandle();
	    
	    for(String s : driver.getWindowHandles()) {
	    		if(!s.equals(parent)) {
	    			driver.switchTo().window(s);
	    			}
	    }
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='WISHLIST']")).click();
	    Thread.sleep(4000);
	    
	    String currentUrl = driver.getCurrentUrl();
	    
	    if(currentUrl.contains("login")) {
	    	System.out.println("User is redirected to login page");
	    }
	    else {
	    	System.out.println("User is not redirected to login page");
	    }
	    
	    driver.close();
	    Thread.sleep(2000);
	    driver.quit();

	}

}
