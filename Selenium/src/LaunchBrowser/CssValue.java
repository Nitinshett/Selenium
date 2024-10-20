package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.facebook.com");
		      WebElement username=driver.findElement(By.name("login"));
		      System.out.println(username.getCssValue("border-radius"));
		

	} 

}
