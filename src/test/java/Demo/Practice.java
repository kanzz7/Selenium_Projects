package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHRM_CommonData/commondata.properties");  //.-> go to my current repository
		Properties prop = new Properties();
		prop.load(fis); //to let understand the compiler which is key and which is value
		String URL = prop.getProperty("url");
		String Browser = prop.getProperty("browser");
		String ValudUserName = prop.getProperty("username");
		String validPassword = prop.getProperty("password");
	
		System.out.println("The default browser for testing is : "+ Browser);
		System.out.println("The URL of the application for testing is : "+ URL);
		System.out.println("The valid username for application is : "+ ValudUserName);
		System.out.println("The valid password for application is : "+ validPassword);
	}

}
