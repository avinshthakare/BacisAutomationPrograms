package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement button = driver.findElement(By.xpath("//button[@id='rightBtn']"));
		Thread.sleep(2000);
		
		// mandate object creation of actions class
		
		Actions act =  new Actions(driver);
		
		
		
		
		//perform Right Click
		act.contextClick(button).build().perform();
		
		Thread.sleep(2000);
		
		
		WebElement copyButton = driver.findElement(By.xpath("//button[@data-action='Copy']"));
		
		// click on copy button
		copyButton.click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
