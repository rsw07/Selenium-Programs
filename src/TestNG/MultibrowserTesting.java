package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultibrowserTesting 
{
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException
	{
		WebDriver driver = null;
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.close();
		
	}

}
