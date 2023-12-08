package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_DependsOnMethods_Ex2
{
	@Test
	public void Login()
	{
		Reporter.log(" Login ",true);
	}
	
	@Test
	public void verify()
	{
		Reporter.log(" verify ",true);
	}
	
	@Test(dependsOnMethods={"Login","verify"})
	public void Logout()
	{
		Reporter.log(" Logout ",true);
	}


}
