package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nitin/OneDrive/Desktop/Selenium/selectname1.html");
		Select select = new Select(driver.findElement(By.id("city")));
		List<WebElement> allOptions = s
		int flag=0;
		
		
		

	}

}
