package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_AssertNotEquals 
{
	@Test
	public void TC1()
	{
		String str1="abc";
		String str2="xyz";
		
		Assert.assertNotEquals(str1, str2,"Failed: both results are  same");
	}

}
