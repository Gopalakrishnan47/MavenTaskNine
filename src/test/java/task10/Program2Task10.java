package task10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2Task10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String expectedText = "Dropped!";
				//Launch Browser
				WebDriver driver = new ChromeDriver();
				
				//navigate to the URL
				driver.navigate().to("https://jqueryui.com/droppable/");
				
				//maximize
				driver.manage().window().maximize();
				
				//implicity wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				
				//switching to frame
				driver.switchTo().frame(0);
				
				//finding Source element with Text
				WebElement sourceElement = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
				
				//finding designation element with Text
				WebElement designationElement = driver.findElement(By.xpath("//p[text()=\"Drop here\"]"));
				String cssValueOfColorBefore = designationElement.getCssValue("color");
				System.out.println(cssValueOfColorBefore);
				
				//before performing drap and drop adding actions class
				Actions mouse = new Actions(driver);
				
				//drag and drop using src, des method
				mouse.dragAndDrop(sourceElement, designationElement).perform();
				
				
				String cssValueOfColorAfter = designationElement.getCssValue("color");
				if(!cssValueOfColorBefore.equals(cssValueOfColorAfter)) {
					System.out.println("Drag and Drop successful");
				}else {
					System.out.println("Drag and Drop not successful");
				}
				
				//validating the text after dropped
				String actualText= designationElement.getText();
				
				if(actualText.equalsIgnoreCase(expectedText))
				{
					System.out.println("After source element dropped into target element TEXT has changed to "+ actualText);
				}else{
					System.out.println("The Designation Text not changed");
				}
				
				//closing the Browser
				driver.quit();
				
				
	}

}
