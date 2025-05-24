package day23Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement mouseRightClick =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions ele = new Actions(driver);
		ele.contextClick(mouseRightClick).perform();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		ele.doubleClick(doubleClick).perform();
	}

}
