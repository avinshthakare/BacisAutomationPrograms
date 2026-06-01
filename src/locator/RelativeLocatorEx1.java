package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorEx1 {
	
	
	public static void main (String args []) throws InterruptedException
	
	{
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		
		// Radio button for 'Married'
		WebElement a =driver.findElement(By.xpath("(//input[@name='m_status'])[2]"));

		Thread.sleep(2000);
		
		// Relative locator used for click on   Radio button for 'Divorced'
		
		
		//method toRightOf()
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(a)).click();
		
		Thread.sleep(2000);
		
		//method below()
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(a)).click();
		
		Thread.sleep(2000);
		
		//method toLeftOf()
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(a)).click();
		
		Thread.sleep(2000);
		
		//method above()
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(a)).sendKeys("Avinash");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	
		
	}
	
	

}
