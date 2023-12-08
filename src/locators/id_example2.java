package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_example2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/id1.html");
		driver.findElement(By.id("123")).sendKeys("abc");  //Username
		driver.findElement(By.id("456")).sendKeys("xyz");  //Password
		
	}

}
