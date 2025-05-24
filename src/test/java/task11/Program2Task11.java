package task11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the URL
		driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
		
		//maximize
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//finding Topframe and saving in WebElement
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		//navigating to TopFrame
		driver.switchTo().frame(topFrame);
		
		
		//finding no of frames
		List<WebElement> noOfFrames = driver.findElements(By.xpath("//frame[@scrolling='no']"));
		int frameSize = noOfFrames.size();
		System.out.println("There are "+frameSize+ "Frames");
		
		//finding leftFrameInTop 
		WebElement leftTopFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		
		//navigating to leftTopFrame
		driver.switchTo().frame(leftTopFrame);
		
		//getting Text from leftFrame
		String leftText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println("Text in Left Frame is :"+leftText);
		
		//navigating to topFrame
		driver.switchTo().parentFrame();
		
		
		//finding middleFrameInTop
		 WebElement middleTopFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		 
		 //navigating to middleTopFrame
		 driver.switchTo().frame(middleTopFrame);
		 
		 //getting text from middleFrame
		 String middleText = driver.findElement(By.xpath("//div[@id='content']")).getText();
		 System.out.println("Text in Middle Frame is :"+ middleText);
		 
		//navigating to topFrame
		driver.switchTo().parentFrame();
		
		//finding rightFrameInTop
		WebElement rightTopFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		
		//navigating to rightTopFrame
		driver.switchTo().frame(rightTopFrame);
		
		//getting text from rightFrame
		String rightText = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println("Text in Right Frame is :"+ rightText);
		
		//navigating to topFrame
		driver.switchTo().parentFrame();
		
		//navigating to defaultContent
		driver.switchTo().defaultContent();
		
		//finding bottom frame
		WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		//navigating to bottomFrame
		driver.switchTo().frame(bottomFrame);
		
		//getting text from bottomFrame
		String bottomText = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println("Text in Bottom Frame is :"+bottomText);
		
		//navigating to defaultContent
		driver.switchTo().defaultContent();
		
		//navigating to topFrame
		//driver.switchTo().frame(topFrame);
		
		//getting pagetext in topaFrame -> not got any title 
		//tried for entire page title not got any title
		
		String pageTitle = driver.getTitle();
				
		System.out.println("The tite of the page is :"+ pageTitle);
		
		//checked for entire page title and in topFrame title too there is not title
		
		
		//quit enter chrome
		driver.quit();		
		
		
	}

}
