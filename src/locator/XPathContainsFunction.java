package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathContainsFunction {
	
	public static void main (String args []) throws InterruptedException
	
	{
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		
		Thread.sleep(3000);
		
		// using contains() function with attribute
		
		// tagname[contains(@attribute,"partial value")]
		
		driver.findElement(By.xpath("(//a[contains(@class,\"list-g\")])[3]")).click();
		
		Thread.sleep(3000);
		
		// using contains() function with text() function
		// tagname[contains(text(),"partial value")]
		
		driver.findElement(By.xpath("//a[contains(text(),\"Moni\")]")).click();
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
