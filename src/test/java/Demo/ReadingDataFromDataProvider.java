package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name = "SampleData")
	Object[][] getdata(){
		return new Object[][] {
			{"key","value"},
			{"username","password"},
			{"Admin","admin123"}
		};
	}
	@Test(dataProvider = "SampleData")
	public void readingFromDataProvider(String key, String value) {
		System.out.println("My key is : " + key + "=======>>>>" + value);
		
	}

}
