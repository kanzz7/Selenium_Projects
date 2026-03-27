package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.navigate to YT 2.search for fav song 3.play the video of song

public class CssTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("Mutta kalaki");
		driver.findElement(By.xpath("class=\"ytSuggestionComponentSuggestion ytSuggestionComponentHighlighted ytSuggestionComponentLargerSuggestion ytSuggestionComponentThumbnailSuggestion ytSuggestionComponentRoundedSuggestion ytSuggestionComponentThumbnailPadding\"")).click();		

	}

}

