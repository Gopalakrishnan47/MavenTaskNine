package task9;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the URL
		driver.navigate().to("https://www.wikipedia.org/");
		
		//maximize
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
		
		//finding search bar 
		WebElement searchBar = driver.findElement(By.id("searchInput"));
		
		//entering value in search bar
		searchBar.sendKeys("Artificial intelligence");
		
		//click on enter button
		searchBar.sendKeys(Keys.ENTER);
		
		//finding history
		driver.findElement(By.id("toc-History")).click();
		
		//getting title of the page and section
		
		//page
		String title = driver.getTitle();
		System.out.println("The Title of the page is : "+ title);
		
		//section
		String sectionTitle = driver.findElement(By.id("History")).getText();
		System.out.println("The title of the section is : "+ sectionTitle );
		
		
		
		//closing the Browser
		driver.quit();
		
		
		
	}

}
