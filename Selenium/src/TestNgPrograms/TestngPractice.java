package TestNgPrograms;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TestngPractice {
@Test(priority=-1)
public void login() {
	Reporter.log("Hello",true);

}
@Test(priority=2,invocationCount=6)
public void createuser() {
	Reporter.log("World",true);

}

@Test(priority=-2)
public void Logout() {
	Reporter.log("op",true);

}

}
