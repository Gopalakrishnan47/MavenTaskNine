package task10;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedText = "Almost Done! Check Your Inbox!";
		String expectedTitle = "GUVI | Login";
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the URL
		driver.navigate().to("https://www.guvi.in/");
		
		//maximize
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//locating signup element
		WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
		signUpButton.click();
		
		//Entering name in text box
		driver.findElement(By.id("name")).sendKeys("Gopalakrishnan Ab");
		
		//Entering emailId 
		driver.findElement(By.id("email")).sendKeys("xyzabcsevd@gmail.com");
		
		//Entering password
		driver.findElement(By.id("password")).sendKeys("qwerty@123");
		
		//Entering number
		driver.findElement(By.id("mobileNumber")).sendKeys("6345612345");
		
		//clicking on signup button
		driver.findElement(By.id("signup-btn")).click();
		
		//clicking on maybe later button
		driver.findElement(By.id("laterBtn")).click();
		
		
		//finding the text of the signup page
		String actualText = driver.findElement(By.xpath("//h1[text()='Almost Done! Check Your Inbox!']")).getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("Sign Up is successfull");
		}
		else {
			System.out.println("Sign Up is Not Successfull");
		}
		
		
		//navigate back
		driver.navigate().back();
		
		//clicking on Login button
		driver.findElement(By.id("login-btn")).click();
		
		//entering email in login page
		driver.findElement(By.id("email")).sendKeys("agkrish22@gmail.com");
		
		//entering password in login page
		driver.findElement(By.id("password")).sendKeys("Kanimozhi@14");
		
		//clicking on login button
		driver.findElement(By.id("login-btn")).click();
		
		//pagetitle
		@Nullable
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);
		
		if(titleOfLoginPage.equals(expectedTitle)) {
			System.out.println("LOGIN is successfull");
		}
		else {
			System.out.println("LOGIN is Not Successfull");
		}
		
		
	}

}
