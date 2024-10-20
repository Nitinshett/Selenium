package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.close();
}
}
