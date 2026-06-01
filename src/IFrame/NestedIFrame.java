package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedIFrame {

public static void main(String args []) throws InterruptedException
	
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		Thread.sleep(3000);
		
		// switch to first iframe
		
		driver.switchTo().frame(1);
		
		// first frame element
		
		String a =driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
        
		// print first frame element
	    System.out.println(a);
	    
	    // switch to second frame
	    
		driver.switchTo().frame(0);
		
		//action perform on second frame element
       
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Avinash thakare");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
	
	
}
