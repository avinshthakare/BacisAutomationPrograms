package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DownDownEx1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();


		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		 Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]"));

		
		Select s = new Select(dropdown);
		
		List<WebElement> option = s.getOptions();
		
		s.selectByValue("search-alias=dvd");
		
		
		for(int i =0;i<option.size();i++)
			
		{
			
			System.out.println(option.get(i).getText());
			
		}
		
		
		driver.quit();
	}

}
