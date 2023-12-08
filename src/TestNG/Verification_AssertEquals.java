package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_AssertEquals 
{
	@Test
	public void TC1()
	{
		String str1="abc";
		String str2="abc";
		
		Assert.assertEquals(str1, str2,"Failed: both results are not same");
	}

}
