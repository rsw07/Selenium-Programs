package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_Priority_Ex3 
{
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(priority=2)                //duplicate priority
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
