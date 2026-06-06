package waitFunction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	
public static void main(String args []) throws InterruptedException
	
	{
		
		WebDriver driver = new EdgeDriver()	;
		driver.get("https://www.dezlearn.com/explicit-wait-example/");;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// implicitlyWait use for all elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		WebElement txt_box = driver.findElement(By.xpath("//input[@name='fname']"));
		txt_box.sendKeys("Avinash");
		
		WebElement txt_box2 = driver.findElement(By.xpath("(//input[@name='lname'])[1]"));
		txt_box2.sendKeys("Thakare");
		
		WebElement txt_box3 = driver.findElement(By.xpath("(//input[@name='lname'])[2]"));
		txt_box3.sendKeys("Email@gam.com");
		
		WebElement btn = driver.findElement(By.xpath("//button[@id='u_5_6']"));
		btn.click();
		
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='u_5_7']"));
		
		//using Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btn2));
		
		//selenium wait until button can clickable
		String txt = driver.findElement(By.xpath("//p[@id='processing']")).getText();
		System.out.println(txt);
		btn2.click();
		
		
		
		
	
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//		// click on the compose button as soon as the "compose" button is visible
	//	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
	}
	
	
	
}
