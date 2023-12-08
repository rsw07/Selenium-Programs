package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_SoftAssert 
{
	@Test
	public void TC1()
	{
		SoftAssert soft = new SoftAssert();
		String str1="abc";
		String str2="abc";
		soft.assertEquals(str1, str2,"Failed: both results are not same");
		
		boolean a = true;
		soft.assertTrue(a, "Failed:result is false");
		
		soft.assertAll();
		
	}

}
