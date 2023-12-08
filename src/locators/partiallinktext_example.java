package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktext_example 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/linktext.html");
		driver.findElement(By.partialLinkText("face")).click();
		
		
	}

}
