package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
		public static void main(String[] args)  {
				
	ChromeDriver driver=new ChromeDriver();
	driver.get("htps://www.facebook.com/");
	driver.findElement(By.tagName("input"));
	System.out.println("identified element");
		}
}

