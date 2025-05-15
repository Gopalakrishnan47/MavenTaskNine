package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9Program1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//maximze
		driver.manage().window().maximize();
		
		//navigate to
		driver.navigate().to("http://google.com");
		
		//geturl of page
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the Page is "+ currentUrl);
		
		//reload page
		driver.navigate().refresh();
		
		//close browser
		driver.quit();				
		
	}

}
