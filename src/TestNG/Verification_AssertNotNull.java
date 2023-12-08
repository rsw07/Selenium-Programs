package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_AssertNotNull 
{
	@Test
	public void TC1()
	{
		String s = "abc";
		Assert.assertNotNull(s);
	}

}
