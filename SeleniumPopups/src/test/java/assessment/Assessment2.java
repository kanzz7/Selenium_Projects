package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 1.       Launch browser
2.       Navigate to
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
3.       Enter Username: Admin
4.       Enter Password: admin123
5.       Click Login
6.       Wait until Dashboard page is displayed
7.       Click Admin from left side menu
8.       Wait until Users page loads
9.       Click Add button
10.  Wait for Add User form to appear
11.  Locate User Role dropdown
12.  Click the dropdown arrow to expand options
13.  Select “Admin”
14.  Verify selected value is displayed inside dropdown field
15.  Re-open dropdown
16.  Select “ESS”
17.  Verify the selected value updates correctly
18.  Click Cancel
19.  Logout
20.  Close browser

 */

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		dropdown.click();
		
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
//		Select sel = new Select(dropdown);
//		sel.selectByVisibleText("Admin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("[@class='oxd-form-actions']")).click();
//		Thread.sleep(2000);
		

	}

}
