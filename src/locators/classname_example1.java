package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname_example1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/className1.html");
		driver.findElement(By.className("789")).sendKeys("ABC");  //Username
		driver.findElement(By.className("456")).sendKeys("XYZ");  //Password	
	}
}
