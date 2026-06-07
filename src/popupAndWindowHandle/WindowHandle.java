package popupAndWindowHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		System.out.println("============================New Button 1=================================");
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Thread.sleep(2000);
		// we need to switch focus to perant window after every window handle to handle peranet variable 
		// to avoid NoSuchElementExection
		String parent = driver.getWindowHandle();
		windowhandles(driver);
		System.out.println("============================New Button 2=================================");
		//move focus to perent window if you want to perform action on perent window
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		Thread.sleep(2000);
		windowhandles(driver);
		System.out.println("============================New Button 3=================================");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		Thread.sleep(2000);
		windowhandles(driver);
		System.out.println("============================New Button 4=================================");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		Thread.sleep(2000);
		windowhandles(driver);
		System.out.println("============================New Button 5=================================");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
		Thread.sleep(2000);
		windowhandles(driver);
		driver.quit();
		

			
	}
	
	static void windowhandles(WebDriver driver) throws InterruptedException
	{

		Set<String> win_IDs = driver.getWindowHandles();
		Iterator<String> all_ID = win_IDs.iterator();
		for(int i=0;i <win_IDs.size();i++)
			
		{
			/* don't used next() method in single statement like below commeted code 
		      vaule will change everytime  if you calling method 
		      call only time time and store in veriable*/
			
//			System.out.println(all_ID.next());
//			driver.switchTo().window(all_ID.next());
			String win = all_ID.next();
			
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			System.out.println("-----------------------------------------------------------");
			Thread.sleep(2000);
			
			if(i!=0)
			{driver.close();}
		}
		
		
	}
	
	
	

}
