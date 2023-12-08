package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4_Annotations 
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Opening Browser",true);
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("Login to App",true);
	}
	
	@Test
	public void VerifyTitle1()
	{
		Reporter.log("Running verifytitle1 test case",true);
	}
	
	@Test
	public void VerifyTitle2()
	{
		Reporter.log("Running verifytitle2 test case",true);
	}

	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("Logout From App",true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Closing Browser",true);
	}
	
}
