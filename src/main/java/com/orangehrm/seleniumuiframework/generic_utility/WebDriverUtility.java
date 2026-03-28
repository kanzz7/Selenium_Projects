package com.orangehrm.seleniumuiframework.generic_utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	WebDriverWait wait;
	
	public WebDriverUtility(WebDriver driver) {
		//PageFactory.initElements( driver, this);
		this.driver = driver;
	}

	// Manage
	// Maximize
	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}

	// Minimize
	public void configMinimizedBrowser() {
		driver.manage().window().minimize();
	}

	// Full screen
	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}

	// Get size
	public Dimension fetchSize() {
		Dimension dimension = driver.manage().window().getSize();
		return dimension;
	}

	// Set size
	public void configBrowserSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	// Get position
	public Point fetchBrowserCoordinates() {
		Point point = driver.manage().window().getPosition();
		return point;
	}

	// Set position
	public void configBrowserCoordinates(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}

	// Navigate to
	public void navigateToApplication(String fullUrl) {
		driver.navigate().to(fullUrl);
	}

	// Navigate to forward
	public void navigateForward() {
		driver.navigate().forward();
	}

	// Navigate to backward
	public void navigateBackward() {
		driver.navigate().back();
		;
	}

	// Refresh
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}

	// Get
	public void enterUrl(String url) {
		driver.get(url);
	}

	// Get title
	public String fetchApplicationTitle() {
		String title = driver.getTitle();
		return title;
	}

	// Get current url
	public String fetchApplicationUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	//Close
	public void closingBrowserTab() {
		driver.close();
	}
	
	//Quit
	public void closingBrowserWindow() {
		driver.quit();
	}
	
	//timeouts
	//implicit wait
	public void waitForElementsToLoad(long timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	
	//explicit wait
	public void waitTillTheElementIsClickable(WebElement element, long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitTillTheElementIsVisible(WebElement element, long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//popups
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void clickOnDismiss(){
		driver.switchTo().alert().dismiss();
	}
	
	public void typeMessageInJavascriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public String fetchJavascriptPopupMessage() {
		String message = driver.switchTo().alert().getText();
		return message;
	}
	
	//ChildWindow switching
	public void windowSwitching(String childApplicationTitle) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child : childIds) {
			driver.switchTo().window(child);
			String title = driver.getTitle();
			if(title.contains(childApplicationTitle)) {
				break;
			}
			
		}
		
	}
	
	public void windowSwitchingByUrl(String childApplicationUrl) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child : childIds) {
			driver.switchTo().window(child);
			String title = driver.getCurrentUrl();
			if(title.contains(childApplicationUrl)) {
				break;
			}
			
		}
		
	}
	
	//Frames
	public void switchFrameByIndex(int indexNo) {
		driver.switchTo().frame(indexNo);
	}
	
	public void switchToFrameByIdOrName(String IdOrNameValue) {
		driver.switchTo().frame(IdOrNameValue);
	}
	
	public void switchToFrameByFrameElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	
	public void switchBacktheControlToMainPage() {
		driver.switchTo().defaultContent();
	}
	
	
	
	
	

}
