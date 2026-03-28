package interrogationAPI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesTask1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String parentID = driver.getWindowHandle();
		System.out.println("This is the Window ID of Parent Window : "+parentID);
		
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentID);
		String FBid="";
		for(String string : allWindowId) {
	    	FBid = string;
	    }
		System.out.println("Facebook Id : "+FBid);
		
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(2000);
		allWindowId = driver.getWindowHandles(); 
	    
	    String twitterId = "";
	    
	    for(String string : allWindowId) {
	    	if(!string.equals(parentID) && !string.equals(FBid)) {
	    		twitterId = string;
	    	}
	    }
	    System.out.println("Twitter Id : "+ twitterId);
	    
	    
		

	}

}
