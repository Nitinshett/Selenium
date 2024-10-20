package LaunchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			WebElement draggable=driver.findElement(By.id("draggable"));
			WebElement droppable=driver.findElement(By.id("droppable"));
			Actions act=new Actions(driver);
			act.clickAndHold(draggable).perform();

		}
	}

