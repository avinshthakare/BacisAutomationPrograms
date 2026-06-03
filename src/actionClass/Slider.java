package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
public static void main(String args[]) throws InterruptedException

	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		WebElement slider = driver.findElement(By.xpath("//div[@id='handle_max']"));
		Thread.sleep(2000);
		
		// mandate object creation of actions class
		
		Actions act =  new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
		//perform slide
		
		act.dragAndDropBy(slider,300,0).build().perform();
		
	
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
	}
	
	
	

}
