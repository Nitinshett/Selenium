package LaunchBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotificationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Robot r=new Robot();
		/* r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER); */
		

	}

}
