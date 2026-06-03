package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String args[]) throws InterruptedException
	
	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleBtn']"));
		Thread.sleep(2000);
		
		// mandate object creation of actions class
		
		Actions act =  new Actions(driver);
		
		//perform Double Click
		act.doubleClick(button).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	
		
		
		
		
		
		
	}
	
	
	

}
