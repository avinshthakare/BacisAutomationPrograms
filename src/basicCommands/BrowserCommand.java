package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommand {
	
	
	public static void main(String args []) throws InterruptedException
	{
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		
		// this method use for the maximize the current window
		
		driver.manage().window().maximize();
		
		
			Thread.sleep(2000);
	
		// this method use for the maximize the current window
		
		driver.manage().window().minimize();
		
		
		Thread.sleep(2000);
		
		//this method use for the Fullscreen the current window
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
