package LaunchBrowser;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click2 {


            public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
            Actions a = new Actions(driver);
            WebElement b=driver.findElement(By.id("pass"));
            a.contextClick(b).perform();
            
	}

}
