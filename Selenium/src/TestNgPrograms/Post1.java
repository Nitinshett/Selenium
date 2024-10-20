package TestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Post1 extends Pre{
	@Test (groups ="regression")
	public void beforeSuite4()
	{
		Reporter.log("beforeSuite",true);
	}
}



