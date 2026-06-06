package waitFunction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitlyWait {
	
	public static void main(String args [])
	
	{
		
		WebDriver driver = new EdgeDriver()	;
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/* implicitly Wait is always defect at the starting
		 * Applies to all elements in a test script.
		 * No need to specify “ExpectedConditions” on the element to be located
		 * to prevent failure from NoSuchElementException if webpage element take time to load
		 */
		// implicitlyWait use for all elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='btn1']"));	
		btn1.click();
				
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='btn2']"));
		btn2.click();
				
		WebElement txt_box = driver.findElement(By.xpath("(//input[@id='txt1'])[1]"));
		txt_box.sendKeys("Avinash");
				
		WebElement txt_box2 = driver.findElement(By.xpath("(//input[@id='txt2'])[1]"));
		txt_box2.sendKeys("Thakare");
		
		

		
	}

}
