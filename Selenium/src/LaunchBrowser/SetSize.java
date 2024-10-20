package LaunchBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
		public static void main(String[] args) throws InterruptedException {
				
				ChromeDriver driver=new ChromeDriver();
				Thread.sleep(5000);
				Dimension d=new Dimension(50,50);
				driver.manage().window().setSize(d);
				System.out.println(driver.manage().window().getSize());
				driver.close();

		}}

