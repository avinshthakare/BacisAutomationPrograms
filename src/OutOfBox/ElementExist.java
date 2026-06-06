package OutOfBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementExist {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		boolean exists = !driver 
			    .findElements(By.id("doubleBtn")) 
			    .isEmpty(); 
			 
			if (exists) System.out.println("Banner is visible"); 

	}

}
