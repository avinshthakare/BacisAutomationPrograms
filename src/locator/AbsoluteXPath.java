package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AbsoluteXPath {
	
	public static void main (String args []) throws InterruptedException
	{
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Absolute Xpath Example, using variable to store webelement 
		
		WebElement textbox = driver.findElement(By.xpath("/html[1]/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/input[1]"));
		
		
		// Action perform
		
		textbox.sendKeys("avinash");
		
		
		Thread.sleep(3000);
		
		
		String name = "Thakare";
		
		// Action perform without storing webelement into the veriable
		// Enter key action perform using special key methods
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div/div/form/div/span[2]/span/input[1]")).sendKeys(name+Keys.ENTER);
		
		
		Thread.sleep(3000);
		
		// Handled element by giving Partial Text
		
		driver.findElement(By.partialLinkText(name)).click();
		
		driver.close();
		
	}

}
