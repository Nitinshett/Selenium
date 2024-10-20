package LaunchBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		Point point =new Point(100000,100000);
		driver.manage().window().setPosition(point);
		System.out.println(driver.manage().window().getPosition());
		driver.close();

}}
