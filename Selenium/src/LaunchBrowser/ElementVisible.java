package LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisible {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.facebook.com");
		     Thread.sleep(1000);
		     driver.findElement(By.partialLinkText("Create")).click();
		     Thread.sleep(1000);
		      try {
		    	  driver.findElement(By.name("preferred_pronoun"));
		         System.out.println("Element is dispalyed");
		      } 
		      catch(Exception e) 
		      {
		         System.out.println("Element is not dispalyed");
		      }
		   }
		}

