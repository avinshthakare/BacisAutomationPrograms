package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scr = driver.findElement(By.xpath("//div[@id=\"dragItem\"]"));
		Thread.sleep(2000);
		
		WebElement trg = driver.findElement(By.xpath("//div[@id=\"dropZone\"]"));
		
		
		// mandate object creation of actions class
		
		Actions act =  new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN);
		//perform Drag and drop Click
		act.dragAndDrop(scr, trg).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
