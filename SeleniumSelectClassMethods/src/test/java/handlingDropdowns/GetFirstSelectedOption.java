package handlingDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		//Locating the listbox
		WebElement listbox = driver.findElement(By.id("cars"));
		//Select class object
		Select sel = new Select(listbox);
		//Select few options
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Volvo");
		System.out.println(sel.getFirstSelectedOption().getText()); //it will retrieve the first element among selected elements
		//Verifying if all the options above are selected or not
		List<WebElement> allSelectedOpts = sel.getAllSelectedOptions();
		for(WebElement opt : allSelectedOpts) {
			System.out.println(opt.getText());
		}
		driver.quit();
		

	}

}
