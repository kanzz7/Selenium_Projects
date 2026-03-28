package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
		WebDriver driver;

		public Dashboard(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(linkText = "PIM")
		private WebElement pimLink;

		@FindBy(linkText = "Recruitment")
		private WebElement recruitment;

		@FindBy(css = "li[class='oxd-userdropdown']")
		private WebElement logoutDropDown;

		public WebElement getPimLink() {
			return pimLink;
		}

		public void clickPimLink() {
			getPimLink().click();
		}

		public WebElement getRecruitment() {
			return recruitment;
		}

		public void clickRecruitmentLink() {
			getRecruitment().click();
		}

		public WebElement getLogoutDropDown() {
			return logoutDropDown;
		}

		public void clickLogoutDropDown() {
			getLogoutDropDown().click();
		}

	}


