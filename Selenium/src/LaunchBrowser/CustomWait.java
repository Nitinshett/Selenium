package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.instagram.com");
		      for(int i=0;i<100;i++)
		      {
		    	  try
		    	  {
		    		  driver.findElement(By.name("username")).sendKeys("ab@gmail.com");
		    		  System.out.print(i);
		    		  break;
		    		  
		    	  }
		      catch(Exception e) {}
		      }      

	}

}
