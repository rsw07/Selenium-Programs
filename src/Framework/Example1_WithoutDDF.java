package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_WithoutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(500);
		String Actual_title = driver.getTitle();
		String Expected_title = "Swag Labs";
		if(Actual_title.equals(Expected_title))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case not passed");
		}
		Thread.sleep(500);
		driver.close();
	}

}
