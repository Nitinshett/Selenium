package TestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Post extends Pre {


		
	@Test (groups ="sanity")
	public void beforeSuite4()
	{
		Reporter.log("sanity",true);
	}
}


