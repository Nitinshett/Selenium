package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAligned {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.instagram.com");
		     Thread.sleep(1000);
		     WebElement username=driver.findElement(By.name("username"));
		     int usernamex=username.getRect().getX();
		     WebElement password=driver.findElement(By.name("password"));
		     int passwordx=password.getRect().getX();
		     if(usernamex==passwordx)
		     System.out.println("Left Aligned");
		     else
		    	 System.out.println("Not Aligned");
		    	 
		     }

}
