package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	
	
	
public static void main(String args[]) throws InterruptedException, IOException
	
	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
		Screenshot.TekesSS(driver,"ashok");
			
	//we can use all SS code in reusable method	
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File dest =new File("C:\\Users\\marsh\\OneDrive\\Desktop\\avinash.png");
//		
//		FileHandler.copy(scr, dest);
		
		Thread.sleep(2000);
		driver.quit();
	}

// Define Reusable method

static void TekesSS(WebDriver driver, String filename) throws IOException
{
	LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss");

    String formattedDate = myDateObj.format(myFormatObj);
    

	TakesScreenshot ts = (TakesScreenshot)driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File dest =new File("C:\\Users\\marsh\\OneDrive\\Desktop\\"+filename+"-"+formattedDate+".png");
	
	FileHandler.copy(scr, dest);

}
	

}
