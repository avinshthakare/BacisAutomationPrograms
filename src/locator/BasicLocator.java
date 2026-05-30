package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocator {
	
	
	public static void main (String args[]) throws InterruptedException
	
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		
		
		
		//----------  use of locator   --------------------
  
		WebElement	fname = driver.findElement(By.id("name"));//------------- id locator
		
//							driver.findElement(By.name("Value")); ----------- name locator
		
//							driver.findElement(By.className("Value")); ------ className locator
		
//							driver.findElement(By.tagName("Value")); -------  tagName locator

	
		fname.sendKeys("Avinash Thakare");
		Thread.sleep(3000);// wait 3 sec
		
		
		//----------use of  LinkText locator--------------------
		
		//   link name user for value
		
		driver.findElement(By.linkText("Apple")).click(); //direct click without decreare the varibale
		Thread.sleep(3000); // wait 3 sec
		
		
		driver.navigate().back(); //---going previous page
		Thread.sleep(3000); // wait 3 sec
		
		//----------use of  partialLinkText locator--------------------
		
		// partial link name use for value actual name = Lenovo, partial name = enov
		driver.findElement(By.partialLinkText("enov")).click(); // 
		Thread.sleep(3000); // wait 3 sec
		
	
		driver.quit();
			
		
	}
	
	

}
