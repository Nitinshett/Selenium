package TestNgPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;

	@Test
	public void parallelExec(String input)
	{
		if(input=="chrome")
		{
			driver=new ChromeDriver();
			
			}
		else
		{
			driver=new EdgeDriver();
			
		}
	}

}
