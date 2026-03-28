package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
	WebDriver driver;
	public RecruitmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Vacancies")
	private WebElement vacanciesLink;
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addBtn;
	
	@FindBy(xpath = "//label[.='Vacancy Name']/../..//div[2]//input")
	private WebElement vacancyName;
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addBtn;
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addBtn;
	
	
		
		public WebElement getVacanciesLink() {
			return vacanciesLink;
		}
		public void clickVacanciesLink() {
			getVacanciesLink().click();
		}
		
		
		

		
	

}
