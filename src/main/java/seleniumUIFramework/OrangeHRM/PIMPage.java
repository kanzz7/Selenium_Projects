package seleniumUIFramework.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage {
	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;

	public WebElement getAddButton() {
		return addButton;
	}

	public void clickAddButton() {
		getAddButton().click();
	}
	
	
	
	
}
