package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Example2 
{
	@Test(groups="Login")
	public void TC6()
	{
		Reporter.log("Running TC6",true);	
	}
	
	@Test(groups="Profile")
	public void TC7()
	{
		Reporter.log("Running TC7",true);	
	}
	
	@Test(groups="Profile")
	public void TC8()
	{
		Reporter.log("Running TC8",true);	
	}
	
	@Test(groups="Settings")
	public void TC9()
	{
		Reporter.log("Running TC9",true);	
	}
	
	@Test(groups="Profile")
	public void TC10()
	{
		Reporter.log("Running TC10",true);	
	}

}
