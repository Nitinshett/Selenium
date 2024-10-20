package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement( By.id("email")).sendKeys("hgqta");
		driver.findElement( By.id("pass")).sendKeys("trter");
		Thread.sleep(2000);
		driver.close();
	}

	}
