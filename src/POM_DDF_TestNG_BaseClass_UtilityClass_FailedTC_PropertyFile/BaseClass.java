package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void InitializeBrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(UtilityClass.GetDataFromPropertyFile("URL"));
	}

}
