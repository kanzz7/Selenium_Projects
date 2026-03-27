package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	@Test
	public void demoTest() {
		String actualValue = "PEC";
		String expectedValue = "PECC";
		//Soft Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		sa.assertAll();
		
		if(actualValue.equals(expectedValue)) {
			System.out.println("Status : Pass");
		}
		else {
			System.out.println("Status : Fail");
		}
		
		sa.assertAll();
	}

}
