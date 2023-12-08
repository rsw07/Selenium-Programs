package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_Fail 
{
	@Test
	public void TC1()
	{
		System.out.println("Running TC1");
		Assert.fail();
	}
	
	@Test
	public void TC2()
	{
		System.out.println("Running TC2");
	}

}
