package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_Priority_Ex2 
{
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test                 //By default priority is 0
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}

	@Test(priority=1)
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}


}
