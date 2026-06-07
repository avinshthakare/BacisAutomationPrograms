package popupAndWindowHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllPopupHandle {
	
	public static void main(String args []) throws InterruptedException
	
	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Simple Alert Popup
		Thread.sleep(2000);
		WebElement alert_btn = driver.findElement(By.xpath("//button[@id='alertBox']"));
		alert_btn.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		
		// Confirmation Alert Popup accept action
		Thread.sleep(2000);
		WebElement alert_btn2 = driver.findElement(By.xpath("//button[@id='confirmBox']"));
		alert_btn2.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());		

		// Confirmation Alert Popup dismiss action
		Thread.sleep(2000);
		alert_btn2.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());				


		// Promt alert popup accept action
		Thread.sleep(2000);
		WebElement alert_btn3 = driver.findElement(By.xpath("//button[@id='promptBox']"));
		alert_btn3.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Avinash Thakare");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());	
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	
}


