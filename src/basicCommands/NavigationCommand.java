package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommand {
	
	
public static void main (String arge[]) throws InterruptedException
{
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.linkedin.com/feed/");
	
    System.out.println("Loaded Initial Page Title: " + driver.getTitle());
    
    // wait system selenium stop for seconds
    // 1 sec = 1000 milisection
    Thread.sleep(2000); //---2 sec wait

    // 2. Navigate to a completely different webpage
    driver.navigate().to("https://www.google.com/");
    System.out.println("Navigated to New Page Title: " + driver.getTitle());
    
    Thread.sleep(2000); //---2 sec wait
    
    // 3. Go backward to the previous webpage (LinkedIn)
    driver.navigate().back();
    System.out.println("Backed up to Title: " + driver.getTitle());
    
    Thread.sleep(2000); //---2 sec wait

    // 4. Go forward to the next webpage (Google)
    driver.navigate().forward();
    System.out.println("Forwarded to Title: " + driver.getTitle());
    
    Thread.sleep(2000); //---2 sec wait
    
    // 5. Refresh webpage 
    driver.navigate().refresh();
    
    
    
    driver.quit();
	
	
	
	
	
}

}
