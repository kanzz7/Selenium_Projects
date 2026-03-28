package com.orangehrm.seleniumuiframework.recruitment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.seleniumuiframework.generic_utility.ActionsHelper;
import com.orangehrm.seleniumuiframework.generic_utility.BaseClass;
import com.orangehrm.seleniumuiframework.generic_utility.ExcelUtility;
import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.Dashboard;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;

import seleniumUIFramework.OrangeHRM.DashboardPage;

public class CreateVacancyTest extends BaseClass{

	@Test
	public void addVacancy() throws IOException {
		ActionsHelper ah = new ActionsHelper(driver);
		ExcelUtility eu = new ExcelUtility();
		RecruitmentPage rp = new RecruitmentPage(driver);
		VacanciesPage vp = new VacanciesPage(driver);
		AddVacancyPage addvp = new AddVacancyPage(driver);
		SoftAssert sa = new SoftAssert();
		//Dashboard
	
		dsp.clickRecruitmentLink();
		//Recruitment page
		rp.clickVacanciesLink();
		//Vacancies
		vp.clickAddbtn();
		//addvp.setVacancyName("v-001");
		eu.loadExcelFile("./src/test/resources/OrangeHRM_TestScriptData/OrangeHRM_Recruitment_Vacancy_TestData/vacancies.xlsx", "addVacancy");
		//act.click(addvp.getJobTitle()).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		addvp.setVacancyName(eu.getDataFromSingleCell(1, 1));
		ah.navigateDownDropdown(addvp.getJobTitle(), 2, 4);
		addvp.setDescriptionTextField(eu.getDataFromSingleCell(1, 2));
//		addvp.setDescriptionTextField("A long description for the requirement");
//		act.sendKeys(addvp.getHiringManagerTextField(), "t").pause(3000).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		ah.scrollDownAutoSuggestion("a", addvp.getHiringManagerTextField(), 4, 1);
		addvp.setNumberOfPositionsTextField(eu.getDataFromSingleCell(1, 3));
		addvp.clickSaveBtn();
//		Thread.sleep(3000);
				
				
//		//Recruitment vacancy
//		addvp.setVacancyName("v-001");
//		act.click(addvp.getJobTitle()).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//		
//		addvp.setDescriptionTextField("A long description for the requirement");
//		act.sendKeys(addvp.getHiringManagerTextField(), "t").pause(3000).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//		addvp.setNumberOfPositionsTextField("15");
//		addvp.getSaveBtn();
		
	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//login
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
//		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("[type='submit']")).click();
//		//Dashboard
//		driver.findElement(By.linkText("Recruitment")).click();
//		//recruitment page
//		driver.findElement(By.linkText("Vacancies")).click();
//		
//		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//		
//		//Recruitment vacancy
//		driver.findElement(By.xpath("//label[text()='Vacancy Name']/../..//input")).sendKeys("Tester");
//		WebElement Jobdropdown = driver.findElement(By.xpath("//label[.='Job Title']/../..//div[@class='oxd-select-text--after']"));
//		
//		Actions actions = new Actions(driver);
//		actions.click(Jobdropdown).pause(2000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//
//		
//		//add description		
//		driver.findElement(By.cssSelector("[placeholder='Type description here']")).sendKeys("Recruitment for techniques");
//				
//		//hiring manager
//		WebElement HiringMgr = driver.findElement(By.xpath("//label[text()='Hiring Manager']/../..//input"));
//		actions.sendKeys(HiringMgr,"t").pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//		
//		
////		driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("");
//		
//		//number of positions
//		driver.findElement(By.xpath("//label[.='Number of Positions']/../..//input")).sendKeys("10");
//		//click on save button
//		driver.findElement(By.cssSelector("['type='submit']")).click();
//	}
//}
