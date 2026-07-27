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
		
		for (int i=0;i<=10;i++) {
		
			
	//	driver.findElement(By.xpath("//button[@name=\"start\" or @name = \"stop\" ]")).click();
		driver.findElement(By.cssSelector("[class=start],[class=stop]")).click();
		Thread.sleep(100);
		
		}
		
		driver.close();
		
		
	}
	
	

}
