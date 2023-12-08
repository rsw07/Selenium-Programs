package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords 
{
	@Test(priority=1,invocationCount=5)
	public void TC1()
	{
		Reporter.log("Running TC1");
	}

}
