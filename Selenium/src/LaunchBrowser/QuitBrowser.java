package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowser {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.quit();
}
}
