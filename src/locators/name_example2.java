package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_example2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/name2.html");
		driver.findElement(By.name("xyz123")).sendKeys("rashmi");;   //Username
		driver.findElement(By.name("xyz123")).sendKeys("123@h");;   //password
	}

}
