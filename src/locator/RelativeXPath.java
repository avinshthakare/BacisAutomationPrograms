package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RelativeXPath {
	
	public static void main (String args [])
	
	{
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// Relative Xpath
		//tagname[@attribut="value"]
		//input[@id="name"]
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Avinash Thakare");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Avinash.com");
		driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("39876543");
		
		driver.close();
		
		
		
		
		
		
		
	}

}
