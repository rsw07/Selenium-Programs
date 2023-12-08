package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_EmailableReport 
{
	@Test
	public void TC1()
	{
		System.out.println("Running Test Case-1");   //output displays in console only
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running Test Case-2");   //output displays in emailable report only
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running Test Case-3",false); //output displays in emailable report only
	}

	
	@Test
	public void TC4()
	{
		Reporter.log("Running Test Case-4",true); //output displays in console as well as emailable report
	}

}
