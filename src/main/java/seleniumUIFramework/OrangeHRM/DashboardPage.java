package seleniumUIFramework.OrangeHRM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="PIM")
	private WebElement pimlink;
	
	@FindBy(linkText = "Recruitment")
	private WebElement recruitment;
	
	@FindBy(xpath="//li[@class=\"oxd-userdropdown\"]")
	private WebElement logoutDropdown;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	

	public WebElement getPimlink() {
		return pimlink;
	}

	public void clickPimlink() {
		getPimlink().click();
	}
	
	public WebElement getRecruitment() {
		return recruitment;
	}

	public void clickRecruitmentLink() {
		getRecruitment().click();
	}

	public WebElement getLogoutDropdown() {
		return logoutDropdown;
	}

	public void clickLogoutDropdown() {
		getLogoutDropdown().click();
	}
	
	public WebElement getLogout() {
		return logout;
	}

	public void clickLogout() {
		getLogout().click();
	}
	
	public void logout() {
		clickLogoutDropdown();
		clickLogout();
	}
}
