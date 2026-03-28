package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextFunc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		//click on xpath
		driver.findElement(By.xpath("//section[.='X Path']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
		
		
		

	}

}
