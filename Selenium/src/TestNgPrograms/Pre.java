package TestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.*;

public class Pre {
	@BeforeMethod (alwaysRun =true)
	public void  login()
	{
		Reporter.log("login",true);

	}
	@AfterMethod (alwaysRun =true)
	public void  logout()
	{
		Reporter.log("logout",true);

	}

	@AfterTest (alwaysRun =true)
	public void  afterTest()
	{
		Reporter.log("afterTest",true);

	}

	@AfterClass (alwaysRun =true)
	public void  afterClass()
	{
		Reporter.log("afterClass",true);

	}

	@AfterSuite (alwaysRun =true)
	public void  afterSuite()
	{
		Reporter.log("afterSuite",true);

	}


	@BeforeTest (alwaysRun =true)
	public void beforeTest()
	{
		Reporter.log("beforeTest",true);
	}

	@BeforeClass (alwaysRun =true)
	public void beforeClass()
	{
		Reporter.log("beforeClass",true);
	}

	@BeforeSuite (alwaysRun =true)
	public void beforeSuite4()
	{
		Reporter.log("beforeSuite",true);
	}
}


