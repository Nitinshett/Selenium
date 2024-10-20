package LaunchBrowser;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.switchTo().newWindow(WindowType.WINDOW);
			Thread.sleep(5000);
	}
		
	}
