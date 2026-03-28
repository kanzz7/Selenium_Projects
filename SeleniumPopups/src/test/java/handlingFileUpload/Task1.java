package handlingFileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='//static.naukimg.com/s/7/104/assets/images/briefcase.bdc5fadf.svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\kanik\\Downloads\\INTERNSHIP REPORT-kani- COLLEGE (2).pdf");
		

	}

}
