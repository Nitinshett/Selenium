package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPresent {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	      System.out.print("links = "+allLinks.size());
	      for(int i=0;i<allLinks.size();i++)
	      {
	    	  System.out.println(allLinks.get(i).getText());
	      }
	  driver.close();
	}

} 
