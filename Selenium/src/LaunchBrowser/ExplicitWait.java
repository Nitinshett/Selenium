package LaunchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.instagram.com");
		      WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("hello")));
		      driver.findElement(By.name("username")).sendKeys("ab@gmail.com");
		  
	}
}
		


