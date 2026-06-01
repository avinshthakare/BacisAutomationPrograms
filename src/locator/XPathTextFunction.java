package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathTextFunction {
	
	
	public static void main (String args []) throws InterruptedException
	
	{
	
	WebDriver driver = new EdgeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.demoblaze.com/");
	
	Thread.sleep(3000);
	
	
	// tagname[text()="value")
	
	driver.findElement(By.xpath("//a[text()=\"Monitors\"]")).click();
	
	Thread.sleep(3000);
	
	// tagname[text()="value")
	
	driver.findElement(By.xpath("//a[text()=\"Laptops\"]")).click();
	
	
	Thread.sleep(3000);
	
	driver.quit();
	}

}
