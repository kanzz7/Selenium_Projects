package seleniumUIFramework.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage {
	@FindBy(name = "firstName")
	private WebElement firstName;
	
	@FindBy(name = "middleName")
	private WebElement middleName;
	
	@FindBy(name = "lastName")
	private WebElement lastName;
	
	@FindBy(xpath = "//label[.='Employee Id']/../..//input")
	private WebElement employeeID;
	
	@FindBy(css = "[class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement createLoginDetailsBtn;
	
	@FindBy(xpath = "//label[.='Username']/../..//input")
	private WebElement userName;
	
	@FindBy(xpath = "//label[.='Password']/../..//input")
	private WebElement password;
	
	@FindBy(xpath = "//label[.='Confirm Password']/../..//input")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		getFirstName().sendKeys(firstName);
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		getMiddleName().sendKeys(middleName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		getLastName().sendKeys(lastName);
	}

	public WebElement getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		getEmployeeID().sendKeys(employeeID);
	}

	public WebElement getCreateLoginDetailsBtn() {
		return createLoginDetailsBtn;
	}

	public void clickCreateLoginDetailsBtn() {
		getCreateLoginDetailsBtn().click();
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		getConfirmPassword().sendKeys(confirmPassword);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}
	
	//Business Logic to add Employee
	public void addEmployee(String firstName, String middleName, String lastName, String employeeID) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		clickCreateLoginDetailsBtn();
	}
	
	//Create credentials
	public void createCredentials(String userNAme, String password) {
		setUserName(userNAme);
		setPassword(password);
		setConfirmPassword(password);
		clickSaveBtn();
	}
	
	
	
}
