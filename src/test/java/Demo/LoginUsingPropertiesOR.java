package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingPropertiesOR {
	WebDriver driver;
	@Test
	public void login() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
		Properties prop = new Properties();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
