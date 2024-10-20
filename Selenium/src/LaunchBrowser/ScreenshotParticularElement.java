package LaunchBrowser;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotParticularElement{

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		      Date date =new Date();
		      String today = date.toString().replace(":","-");
		      driver.manage().window().maximize();
		      driver.get("https://demowebshop.tricentis.com/");
		      WebElement subscribe =driver .findElement(By.id("newsletter-subscribe-button"));
		      File destination = new File("./Screenshot"+today+".png");
		      File source=subscribe.getScreenshotAs(OutputType.FILE);
		      FileHandler.copy(source,destination);
		      
		      driver.close();
		      }
}
