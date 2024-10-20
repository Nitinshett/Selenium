package LaunchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.instagram.com");
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		      driver.findElement(By.name("username")).sendKeys("ab@gmail.com");
		  
	}
}
