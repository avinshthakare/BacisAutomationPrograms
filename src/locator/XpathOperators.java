package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathOperators {
	
	public static void main(String args[]) throws InterruptedException
	
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// handlin Dynamic WebElement using (and , or) Operator
		
		
		driver.findElement(By.xpath("//button[@name=\"start\" or @name = \"stop\" ]")).click();
		
		Thread.sleep(3000);
		
		//both above and below xpath is same, just use "and" operator for showcase 
		
		driver.findElement(By.xpath("//button[@name=\"start\" or @name = \"stop\" and  @onclick=\"toggleButton(this)\" ]")).click();
		
		Thread.sleep(3000);
		
		// handlin Dynamic WebElement using Operator(and , or) and text Function
		
	
		
		driver.findElement(By.xpath("//button[text()=\"START\" or text() = \"STOP\" ]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=\"START\" or text() = \"STOP\" ]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	
	

}
