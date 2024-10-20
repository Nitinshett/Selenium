package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://demowebshop.tricentis.com/");
		      WebElement loginbtn=driver.findElement(By.id("newsletter-subscribe-button"));
		      loginbtn.click();

	}

}
