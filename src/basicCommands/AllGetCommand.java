package basicCommands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AllGetCommand {
	
	
	public static void main(String args[]) {
		
		WebDriver driver = new EdgeDriver();
		
		
		 driver .get("https://avinashthakare.vercel.app/");
		 
		 
		 String title = driver.getTitle();
         String url = driver.getCurrentUrl();
         String source = driver.getPageSource();
         

         System.out.println("=== Page Title ===");
         System.out.println(title); 
         
         System.out.println("\n=== Current URL ===");
         System.out.println(url); 
         
         
         System.out.println("\n=== Page Source ===");
         
         System.out.println(source);
		 
		 
		 driver.quit();
		 
		 
		
		
		
	}

}
