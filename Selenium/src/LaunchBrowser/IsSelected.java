package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			      driver.manage().window().maximize();
			      driver.get("https://www.facebook.com");
			     Thread.sleep(1000);
				System.out.println(driver.findElement(By.partialLinkText("Create")).getRect().getHeight());
			   
		}      
	}
