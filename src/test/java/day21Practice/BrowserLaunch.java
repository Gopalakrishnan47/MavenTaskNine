package day21Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STEP1 Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//Step2 launch url
		driver.get("https://www.google.com/");
		 
		//Step3 maximize
		driver.manage().window().maximize();
		
		
	}

}
