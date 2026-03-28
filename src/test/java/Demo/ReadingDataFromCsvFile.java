package Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadingDataFromCsvFile {
	@Test
	public void readCsvData() throws IOException {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader("./src/test/resources/OrangeHRM_TestScriptData/OrangeHRM_Recruitment_Vacancy_TestData/Sample.csv"));
		while ((line = br.readLine())!=null) {
			String data[] =line.split(",");
			String key = data[0];
			String value = data[1];
			System.out.println(key);
			System.out.println(value);
			System.out.println("=>" + value);
		}
	}

}
