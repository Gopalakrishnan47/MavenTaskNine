package task11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedText = "New Window";
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the URL
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		
		//maximize
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//storing original window text 
		@Nullable
		String originalWindowTitle = driver.getTitle();
		
		//finding click here button and clicking on it
		WebElement clickHereText = driver.findElement(By.linkText("Click Here"));
		clickHereText.click();
		
		// Get set of windows
		Set<String> windowHandles = driver.getWindowHandles();
				
		// Convert Set to List
		List<String> windows = new ArrayList<String>(windowHandles);
				
		// Pick up the particular window and switch to it
		driver.switchTo().window(windows.get(1));
		
		//fetching text from the page
		String actualText = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		
		//validating the page with Text
		
		if(actualText.equals(expectedText)) {
			System.out.println("Page Loaded Successfully and content of the page is: "+ actualText);
		}else {
			System.out.println("Page not Loaded Successfully");
		}
		
		//closing the current tab
		driver.close();
		
		//switching driver access to Original Window
		driver.switchTo().window(windows.get(0));
		
		//verifying the Original window is active or not
		@Nullable
		String titleOfThePage = driver.getTitle();
		
		if(titleOfThePage.equals(originalWindowTitle)) {
			System.out.println("Original Window is Active");
		}else {
			System.out.println("Original Window is Not Active");
		}
		
		//closing Webdriver completely
		driver.quit();
		
	}

}
