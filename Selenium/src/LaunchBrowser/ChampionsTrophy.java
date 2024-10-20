package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChampionsTrophy {

	private static WebElement option;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nitin/OneDrive/Desktop/Selenium/selectname1.html");
		Select select = new Select(driver.findElement(By.id("2025CT")));
		List<WebElement> allOptions = select.getOptions();
		int flag=0;
		for (WebElement option:allOptions);
		{
			flag=0;
			if(option.getText().equalsIgnoreCase("India"))
			{
				System.out.println("Playing 2025 CT");
				break;
			}
			else
				flag=1;
		}
		
		if(flag==1)
			System.out.println("Not Playing 2025 CT");
		driver.close();
		}

	}
