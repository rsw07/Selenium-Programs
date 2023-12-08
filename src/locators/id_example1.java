package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class id_example1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/id2.html");
		driver.findElement(By.id("123")).sendKeys("abc");  //Username
		driver.findElement(By.id("123")).sendKeys("xyz");  //Password
	}

}
