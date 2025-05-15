package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String pageTitle = "STORE"; 
				//Launch Browser
				WebDriver driver = new ChromeDriver();
				
				//navigate to the URL
				driver.navigate().to("https://www.demoblaze.com/");
				
				//maximize
				driver.manage().window().maximize();
				
				//getTitle of the Page				
				String currentTitle = driver.getTitle();
				System.out.println(currentTitle);
				
				//Validate the page with Title 
				if(pageTitle.equals(currentTitle) ) {
					System.out.println("Page landed on correct Website");
				}else {
					System.out.println("Page not landed on correct Website");
				}	
				
				//closing the Browser
				driver.quit();
				
	}

}
