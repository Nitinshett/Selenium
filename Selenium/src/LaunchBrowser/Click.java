package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.switchTo().activeElement().sendKeys("1220134");
			
		//	WebElement usernameTextfield=driver.findElement(By.id("email"));
		//	usernameTextfield.sendKeys("nitinvasanthshetty@gmail.com");
		//	WebElement passwordTextfield=driver.findElement(By.id("pass"));
		//	passwordTextfield.sendKeys("nitinvasanthshetty@gmail.com");
		//	Thread.sleep(2000);
		//	usernameTextfield.clear();
			Thread.sleep(2000);
			driver.close();
		}
}

