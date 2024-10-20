package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	
	public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			System.out.print(driver.getWindowHandle());
			driver.switchTo();

	}

}
