package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_AssertNull 
{
	@Test
	public void TC1()
	{
		String s = null;
		Assert.assertNull(s);
	}

}
