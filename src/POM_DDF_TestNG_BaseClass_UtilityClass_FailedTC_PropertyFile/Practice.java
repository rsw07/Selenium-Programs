package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Practice 
{
	WebDriver driver;
	int TCID=1;
	@Test
	public void TC1()
	{
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		boolean val1 = true;
		String val2 ="abv";
		
		Assert.assertEquals(val1, val2);
	}

	@AfterMethod
	public void ss(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\wasdi\\eclipse-workspace\\Selenium\\SS_FailedTC\\TestCaseID"+TCID+".JPG");
			FileHandler.copy(src, dest);
		}
		
	}
}
