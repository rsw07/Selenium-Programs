package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Verification_AssertFalse 
{
	@Test
	public void TC1()
	{
		boolean result = false;
		Assert.assertFalse(result);
	}

}