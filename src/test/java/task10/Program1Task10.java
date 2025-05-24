package task10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int date = 22;
				//Launch Browser
				WebDriver driver = new ChromeDriver();
				
				//navigate to the URL
				driver.navigate().to("https://jqueryui.com/datepicker/");
				
				//maximize
				driver.manage().window().maximize();
				
				//implicity wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				
				//switching to frame
				driver.switchTo().frame(0);
				
				//clicking on date input box
				WebElement overAllDate = driver.findElement(By.id("datepicker"));
				overAllDate.click();
				
				//clicking on arrow to get nextMonth
				driver.findElement(By.linkText("Next")).click();
				
				//clicking on the date
				//WebElement Date = driver.findElement(By.linkText("22"));-> by linktext
				WebElement Date1 = driver.findElement(By.xpath("//a[@data-date='"+date+"']"));
				Date1.click();
				
				//geting the value of in the date we selected
				driver.findElement(By.id("datepicker")).getText();
				
				//print the date in console
				@SuppressWarnings("deprecation")
				String selectedDate = overAllDate.getAttribute("value");
				System.out.println("Selected Date is :"+ selectedDate);
				
				//closing the Browser
				driver.quit();
				
				

	}

}
