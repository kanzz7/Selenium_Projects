package com.orangehrm.seleniumuiframework.generic_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersImplementation implements ITestListener{
//	ExtentReports extent = new ExtentReports();
//	ExtentSparkReporter spark =new ExtentSparkReporter("./Reports/test_result.html");
//	ExtentTest test;
	ExtentReports extent = ExtentReportUtility.getExtentInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	WebDriver driver;


	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest et = extent.createTest(result.getMethod().getMethodName()); //capture the name of the test report
		test.set(et);
	}

	@Override
	public void onTestSuccess(ITestResult result) { //pass the test case
		test.get().pass("Test Status : Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) { //fail the test case and print the exception
		test.get().fail("Test Status : Fail");
		test.get().fail(result.getThrowable());
		Object obj = new Object();
		BaseClass bsc = (BaseClass) obj; //downcast to baseclass
		WebDriver driver = bsc.driver; //pointing that we are using the same driver as we are not directly extend baseclass or create obj for baseclass using new as everytime it will create new driver
		ScreenshotUtility sc = new ScreenshotUtility();
		try {
			sc.captureScreenshot(driver, result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) { //status of skipped tc
		test.skip("Test status : Skip");
		
	}
	

	@Override
	public void onFinish(ITestContext context) { //we have to flush the report
		extent.flush();
	}

}
