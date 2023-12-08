package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_xml1 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2()
	{
		String ActResult = "xyz";
		String ExpResult = "abc";
		Assert.assertEquals(ActResult, ExpResult,"Failed:Both results are different");
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}

}
