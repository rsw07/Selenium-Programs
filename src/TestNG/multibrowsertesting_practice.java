package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowsertesting_practice 
{
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException
	{
		WebDriver driver = null;
		
		if(browsername.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if(browsername.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
