package TestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.*;

public class Priority {
	@DataProvider()
	public String[] value1() {
		String value[]={"a","b","c"};
		return value;
	
	}
	
	@Test(priority=-1, dataProvider="value1",invocationCount=6)
	public void createuser(String value)  {
		Reporter.log("Hello"+value,true);

}
} 
 