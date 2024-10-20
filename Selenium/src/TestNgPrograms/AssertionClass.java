package TestNgPrograms;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClass {
	@Test (dependsOnMethods = "login")
	public void register()
	{
        // asst.fail();
		Reporter.log("beforeSuite",true);	
		Assert.fail();
		Reporter.log("beforeSuite",true);
		Reporter.log("beforeSuite",true);
		Reporter.log("beforeSuite",true);
		// asst.assertAll();
		
		}
	
	@Test (dependsOnMethods = "register")
	public void login()
	{
        // SoftAssert asst=new SoftAssert();
        // asst.fail();
		Reporter.log("beforeSuite",true);	
		// Assert.fail();
		Reporter.log("beforeSuite",true);
		Reporter.log("beforeSuite",true);
		Reporter.log("beforeSuite",true);
		// asst.assertAll();
		
		}
		}


