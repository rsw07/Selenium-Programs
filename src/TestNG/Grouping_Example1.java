package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Example1 
{
	@Test(groups="Login")
	public void TC1()
	{
		Reporter.log("Running TC1",true);	
	}
	
	@Test(groups="Login")
	public void TC2()
	{
		Reporter.log("Running TC2",true);	
	}
	@Test(groups="Settings")
	public void TC3()
	{
		Reporter.log("Running TC3",true);	
	}
	
	@Test(groups="Profile")
	public void TC4()
	{
		Reporter.log("Running TC4",true);	
	}
	
	@Test(groups="Settings")
	public void TC5()
	{
		Reporter.log("Running TC5",true);	
	}

}
