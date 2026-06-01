package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleIFrame {
	
	public static void main(String args []) throws InterruptedException
	
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		/*
		  There are thre value we keep in fram
		  by index
		  by ID and name
		  by Webelement
		*/
		
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Avinash thakare");
		
		

		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
