package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_Timeout 
{
	@Test(timeOut=5000)                   
	public void TC1() throws InterruptedException
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test               
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}

	@Test             
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}



}
