package LaunchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.text-compare.com/");
		WebElement text1=driver.findElement(By.id("inputText1"));
		Actions act=new Actions(driver);
		text1.sendKeys("hello");
        act.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        act.keyDown(Keys.CONTROL).keyDown("v").keyUp("v").keyUp(Keys.CONTROL).perform();
	}

}
