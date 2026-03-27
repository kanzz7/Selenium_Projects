package handlingDropdowns;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(2000);
            //locating the skills dropdown
			WebElement dropdown = driver.findElement(By.id("Skills"));
            //Making object of select class
			Select sel = new Select(dropdown);
            //calling select method by index
			sel.selectByIndex(9);
			Thread.sleep(2000);
            //By value attribute
			sel.selectByValue("Data Analytics");
			Thread.sleep(2000);
            //By Visible Text
			sel.selectByVisibleText("Engineering");
			Thread.sleep(2000);
            //By contains visible text to click on javascript
			sel.selectByContainsVisibleText("script");
			Thread.sleep(2000);
			}
	}


