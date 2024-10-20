package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {	
		ChromeDriver driver=new ChromeDriver();
		String ExpectedURL=("https://www.facebook.com/");
	    driver.get("https:/www.facebook.com/");
	    String ActualURL=driver.getCurrentUrl();
	    If(ActualURL.equals(ExpectedURL));
	    System.out.println("Test case passed");
	    	System.out.println("Test case fail");
	    	System.out.println("Expected and Actual title are different");
	    	System.out.println("Expected is \"+ExpectedURL + \"but actual is \"+ actualURL");
	    }

	private static void If(boolean equals) {
		// TODO Auto-generated method stub
		
	}

	}