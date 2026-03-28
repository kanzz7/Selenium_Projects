package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	@Test
	public void practice() {
		//Create a New Test
		ExtentReports test = new ExtentReports();
		//Create a reporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sample_report.html");
		test.attachReporter(spark);
		
		ExtentTest ref = test.createTest("Sample Test");
		//Logging
		ref.info("Started test execution");
		ref.pass("The test has passed");
		ref.fail("The test has failed");
		//write the report
		test.flush();
		
	}

}
