package LaunchBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickable {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			      driver.manage().window().maximize();
			      driver.get("https://demowebshop.tricentis.com/");
			      List<WebElement> allCheckbox=driver.findElements(By.name("pollanswers-1"));
			      for(int i=0;i<4;i++)
			      {
			    	  allCheckbox.get(i).click();
			    	  Thread.sleep(1000);
			      }
			  driver.close();		}
	}

