package practice;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("Mail");
		Thread.sleep(1000);
		
		driver.get("https://leetcode.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.id("id_login")).sendKeys("Kaniiii");
		Thread.sleep(1000);
		
		
	    driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);
		driver.findElement(By.id("ucc-1")).sendKeys("Chennai");
		Thread.sleep(1000);
		
		driver.get("https://www.udemy.com/join/passwordless-auth/");
		Thread.sleep(2000);
		driver.findElement(By.id("form-group--1")).sendKeys("Jonnyy");
		Thread.sleep(1000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("John");
		Thread.sleep(1000);
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("1039")).sendKeys("Chennai");
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.id(":r0:")).sendKeys("kani@gmail.com");
	
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("login_field")).sendKeys("kani"
				+ "@gmail.com");
		
		
			
		
		
		

	}

}
