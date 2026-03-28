package Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
	@Test
	public void login() throws SAXException, IOException, ParserConfigurationException {
		//Read data from xml file
		Document file = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("./src/main/resources/DemoObjectRepository/LoginPage.xml"));//reading the xml file data
		//Fetching the string value
		String username = file.getElementsByTagName("UsernameField").item(0).getTextContent();
		String password = file.getElementsByTagName("passwordField").item(0).getTextContent();
		String loginBtn = file.getElementsByTagName("loginButton").item(0).getTextContent();
		//Splitting the locator and value
		String userloc = username.split(":")[0];
		String userLocValue = username.split(":")[1];
		String passLoc = password.split(":")[0];
		String passLocValue = password.split(":")[1];
		String loginLoc = loginBtn.split(":")[0];
		String loginLocValue = loginBtn.split(":")[1];
		//Test Script
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//username
		if(userloc.equals("name")) {
			driver.findElement(By.name(userLocValue)).sendKeys("Admin");
		}
		//password
		if(passLoc.equals("name")) {
			driver.findElement(By.name(passLocValue)).sendKeys("admin123");
		}
		//Login Button
		if(loginLoc.equals("name")) {
			driver.findElement(By.cssSelector(loginLocValue)).click();
		}
		
		
		
		
	}

}
