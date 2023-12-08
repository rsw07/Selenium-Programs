package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext_Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/linktext.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("facebook")).click();
	}
	
	
	

}
