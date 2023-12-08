package Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
		SwaglabsLoginPage Login = new SwaglabsLoginPage(driver);
		Login.EnterUN();
		Login.EnterPWD();
		Thread.sleep(2000);
		Login.clickLoginbtn();
		Thread.sleep(2000);
		
		
		SwaglabsHomePage Home = new SwaglabsHomePage(driver);
		Home.FetchTitle();
		Home.clickonview();
		Thread.sleep(2000);
		
		SwaglabsViewPage View = new SwaglabsViewPage(driver);
		View.clickonlogout();
		Thread.sleep(2000);
		driver.close();
			
		
	}

}
