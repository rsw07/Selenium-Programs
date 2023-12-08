package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_DependsOnMethods
{
	@Test
	public void Login()
	{
		Reporter.log(" Login ",true);
	}
	
	@Test(dependsOnMethods={"Login"})
	public void Logout()
	{
		Reporter.log(" Logout ",true);
	}


}
