package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
			driver.findElement(By.xpath(null))
			Thread.sleep(2000);
			driver.close();

	}

}
