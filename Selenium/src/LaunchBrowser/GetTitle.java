package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String ExpectedTitle="log in to facebook...";
		driver.get("https://www.facebook.com/login");
		String actualTitle=driver.getTitle();
		If(actualTitle.equals(ExpectedTitle));
		System.out.println("Test case Pass"); 
		System.out.println("Test case Fail");
		System.out.println("Expected and Actual title are different");
		String Expected;
		System.out.println("Expected is "+ExpectedTitle + "but actual is "+ actualTitle);
		}

	private static void If(boolean equals) {
		// TODO Auto-generated method stub
		
	}
		
	}	
