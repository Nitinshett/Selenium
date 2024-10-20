package LaunchBrowser;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Alert{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert a=driver.switchTo().alert();
		a.sendKeys("Hello");
		a.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.close();
	}

}


