package practice;

import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Fetching the url of the current web page
		System.out.println(driver.getCurrentUrl());
		//Navigating to Google
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		//fetching the source code of the page
		System.out.println(driver.getPageSource());
		driver.close();

	}

}

