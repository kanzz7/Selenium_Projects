package assessment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1.     Navigate to  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

2.       Wait until the login page loads completely

3.       Locate the hyperlink text “OrangeHRM, Inc” below the login form

4.       Capture the current window handle (Parent Window ID)

5.       Click on the “OrangeHRM, Inc” link

6.       Wait for a new browser tab/window to open

7.       Fetch all window handles

8.       Switch driver control to the newly opened child window

9.       Validate that the URL contains orangehrm.com

10.  Validate that the page title is not empty

11.  Close the child window

12.  Switch back to the parent window

13.  Verify that the login page is still displayed

14.  Close the browser */

public class Assessment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?utm_source=chatgpt.com");
		Thread.sleep(4000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		Thread.sleep(4000);
		Set<String> allWindowId = driver.getWindowHandles();
		for(String s : allWindowId) {
			if(!s.equals(parentId)) {
			driver.switchTo().window(s);
			}
		}
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("orangehrm.com")) {
			System.out.println("The current URL contains orangehrm.com");
		}
		else {
			System.out.println("The current URL does not contain orangehrm.com");
		}
		
		Thread.sleep(2000);
		
		if(!driver.getTitle().isEmpty()) {
			System.out.println("The page title is not empty");
		}
		
		else {
			System.out.println("The page title is empty");
		}
		
		driver.close();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.cssSelector("[class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed();
		
		driver.quit();

	}

}
