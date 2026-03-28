package seleniumUIFramework.OrangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//Username textfield
	@FindBy(name = "username")
	private WebElement userName;
	
	//Password textfield
	@FindBy(name = "password")
	private WebElement passWord;
	
	//Login button
	@FindBy(css = "[type='submit']")
	private WebElement loginBtn;
	
	//Forget password link
	@FindBy(xpath = "//p[.='Forgot your password? ']")
	private WebElement forgetPwd;
	
	//LinkedIn link
	@FindBy(xpath = "[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedInLink;

	//Facebook link
	@FindBy(xpath = "[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement faceBookLink;

	//Twitter link
	@FindBy(xpath = "[href='https://twitter.com/orangehrm?lang=en']")
	private WebElement twitterLink;
	
	//Youtube link
	@FindBy(xpath = "[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youTubeLink;

	

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String validUserName) {
		getUserName().sendKeys(validUserName);
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String validPassWord) {
		getPassWord().sendKeys(validPassWord);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		getLoginBtn().click();
	}

	public WebElement getForgetPwd() {
		return forgetPwd;
	}

	public void clickForgetPwd() {
		getForgetPwd().click();
	}

	public WebElement getLinkedInLink() {
		return linkedInLink;
	}

	public void clickLinkedInLink() {
		getLinkedInLink().click();
	}

	public WebElement getFaceBookLink() {
		return faceBookLink;
	}

	public void clickFaceBookLink() {
		getFaceBookLink().click();
	}

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	public void clickTwitterLink() {
		getTwitterLink().click();;
	}

	public WebElement getYouTubeLink() {
		return youTubeLink;
	}

	public void clickYouTubeLink() {
		getYouTubeLink().click();
	}
	
	//Business logic
	
	//Login
	public void login(String validUserName, String ValidPassword) {
		setUserName(validUserName);
		setPassWord(ValidPassword);
		clickLoginBtn();
	}

	
	
	
	

}
