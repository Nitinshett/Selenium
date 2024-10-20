package LaunchBrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorexample  {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for(int i=0;i<1000;i++) {
			jse.executeScript("window.scrollBy(0,1)");
		}
		jse.executeScript("window.scrollTo(0,0)");

	}
}
